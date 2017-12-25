/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dao;

import com.constants.DataBaseConstants;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Jagan
 */
public class MySQLConnector implements ConnectionI{

    private Connection connection = null;
    private ResultSet resultSet = null;
    private CallableStatement callableStatement=null;
    
    @Override
    public void initializeConnection() {
            
      try {   
             Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager
             .getConnection(DataBaseConstants.MYSQL_DATABASE_URI,DataBaseConstants.MYSQL_DATABASE_USERID,DataBaseConstants.MYSQL_DATABASE_PWD); 
             System.out.println("Database Connected");
      } 
      catch (ClassNotFoundException ex) {
      
      }
      catch (SQLException ex) {
      
      }
      finally
      {
          
      }       
    }

    @Override
    public ResultSet executeSTP(String stpName,List parms) {
        
        try {
            
            callableStatement =connection.prepareCall(assembleSTPCall(stpName,parms.size()), ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            for(int i=0;i<parms.size();i++) 
            {
               if( parms.get(i).getClass().equals(String.class))
                callableStatement.setString(i+1, (String)parms.get(i));
               else if( parms.get(i).getClass().equals(Integer.class))
                callableStatement.setInt(i+1, (int)parms.get(i));
               else if( parms.get(i).getClass().equals(Double.class))
                callableStatement.setDouble(i+1, (Double)parms.get(i));
               else if( parms.get(i).getClass().equals(Date.class))
                callableStatement.setDate(i+1, (java.sql.Date)parms.get(i));
               else if( parms.get(i).getClass().equals(Long.class))
                callableStatement.setLong(i+1, (Long)parms.get(i));
               else
                callableStatement.setObject(i+1, parms.get(i));
            }
            resultSet=callableStatement.executeQuery();           
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
       return resultSet ;
    }
    
    private String assembleSTPCall(String stpName,int parmslength)
    {
        
        StringBuffer stringBuffer=new StringBuffer();
            stringBuffer.append(DataBaseConstants.STP_CALL);
            stringBuffer.append(DataBaseConstants.SPACE);
            stringBuffer.append(DataBaseConstants.SCHEMA_MAIN);
            stringBuffer.append(stpName);
            stringBuffer.append(DataBaseConstants.SPACE);
            stringBuffer.append(DataBaseConstants.OPEN_BRACKETS);
            for (int i=0;i<parmslength;i++)
            {  
             stringBuffer.append(DataBaseConstants.PARAM_IND);
             if(i!=parmslength-1)
              stringBuffer.append(DataBaseConstants.COMMA);
            }
            stringBuffer.append(DataBaseConstants.CLOSE_BRACKETS);
            stringBuffer.append(DataBaseConstants.CLOSE_PARANTHESIS);
            
            return stringBuffer.toString();
    }

    @Override
    public void closeConnection() {
        System.out.println("closing the connection");
        try
        {
        if(callableStatement!=null)
            callableStatement.close();
        if(resultSet!=null)
            resultSet.close();
        if(connection!=null)
            connection.close();
        }
        catch(SQLException e)
        {
            
        }
       
    }
    
}
