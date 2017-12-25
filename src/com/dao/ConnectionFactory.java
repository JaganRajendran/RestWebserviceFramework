/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dao;

import com.constants.DataBaseConstants;

/**
 *
 * @author Jagan
 */
public class ConnectionFactory {
    
    public static ConnectionI getDatabseObject(Enum databseType)
    {
        if(databseType.equals(DataBaseConstants.DATABASE_TYPE.MYSQL))     
            return new MySQLConnector();
        return null;
    }
    
}
