/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.utilities;

import com.constants.URLConstants;

/**
 *
 * @author Jagan
 */
public class UniversitySelector {
    
    public static String getUniversity(String univ)           
    {
        String univURL;
        if(univ.equalsIgnoreCase(URLConstants.univ1Name))
        {
            univURL=URLConstants.univ1URL;
        }
        else if(univ.equalsIgnoreCase(URLConstants.univ2Name))
        {
            univURL=URLConstants.univ2URL;
        }
        else if(univ.equalsIgnoreCase(URLConstants.univ3Name))
        {
            univURL=URLConstants.univ3URL;
        }
        else if(univ.equalsIgnoreCase(URLConstants.univ4Name))
        {
            univURL=URLConstants.univ4URL;
        }
        return "";
    }
}
