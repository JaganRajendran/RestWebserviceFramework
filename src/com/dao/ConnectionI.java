/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dao;

import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author Jagan
 */
public interface ConnectionI {
    public void initializeConnection();
    public ResultSet executeSTP(String STPName,List parms);
    public void closeConnection();
    
}
