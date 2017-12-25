/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.utilities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Jagan
 */
public class SQLDateConverter {
    public static java.sql.Date ConvertStringToSQLDate(String str)
    {
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        Date date=null;
        try {
            date = formatter.parse(str);
        } catch (ParseException ex) {
            System.out.println("Cannot Parse"+ex);
        }
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        return sqlDate;
    }
    
}
