/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.communicator;

import com.clientRequest.RequestMasterObjectI;
import com.clientResponse.ResponseMasterObjectI;
import com.constants.DataBaseConstants;
import com.dao.ConnectionFactory;
import com.dao.ConnectionI;
import com.utilities.JsonUtilities;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jagan
 */
public class DBCommunicator {
    
    public String getJsonResponseForService(RequestMasterObjectI clientReqObj)
    {
        String response[][]=null;
        String returnData="";
        ConnectionI mysqlConnector=null;
        try
        {
        mysqlConnector=ConnectionFactory.getDatabseObject(DataBaseConstants.DATABASE_TYPE.MYSQL);
        mysqlConnector.initializeConnection();
        ResultSet dataset =mysqlConnector.executeSTP(clientReqObj.getSTP(), clientReqObj.getProperties());
        response=parseResultSet(dataset);   
        List<ResponseMasterObjectI> responseObj=new ArrayList<ResponseMasterObjectI>();
        if(response!=null)
        for(String data[]:response)
        {
           ResponseMasterObjectI respObj;
           respObj=clientReqObj.getResponseObj();
           respObj.setProperties(data);
           responseObj.add(respObj);
        }
        returnData=JsonUtilities.convertObjToJson(responseObj);
        }
        catch(SQLException se)
        {
           System.out.println(se);
        }
        finally
        {
             if(mysqlConnector!=null)
                mysqlConnector.closeConnection();
        }
        return returnData;
    }
     public String[][] parseResultSet(ResultSet rs) throws SQLException
   {
       ResultSetMetaData rsmd = rs.getMetaData();
       int colCount = rsmd.getColumnCount(); 
       String results[][]=null;
       if(colCount>0)
       {
       rs.last();
       int rowCount=rs.getRow();
       rs.beforeFirst();
       results=new String[rowCount][colCount];
       int i=0;
       while(rs.next())
       {
           for(int j=0;j<colCount;j++)
           {
              results[i][j]=new String(); 
              results[i][j]=rs.getString(j+1)!=null?rs.getString(j+1):"";
           } 
           
           i++;           
       }
       }
       return results;
   } 
    
}
