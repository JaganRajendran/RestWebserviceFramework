/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.utilities;

import com.google.gson.Gson;

/**
 *
 * @author Jagan
 */
public class JsonUtilities {
    
    public static String convertObjToJson(Object obj)
    {
        Gson gson =new Gson();
        return gson.toJson(obj);
    }

    /**
     *
     * @param <T>
     * @param str
     * @param obj
     * @return
     */
    
    public static <T> Object convertJsonToObj(String str, T obj)
    {
        try
        {
        Gson gson=new Gson();
        T convObj=gson.fromJson(str, (Class<T>) obj);
        return convObj;
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        return null;
                
    }
    
}
