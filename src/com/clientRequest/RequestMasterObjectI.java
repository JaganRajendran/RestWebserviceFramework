/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.clientRequest;

import com.clientResponse.ResponseMasterObjectI;
import java.util.List;

/**
 *
 * @author Jagan
 */
public interface RequestMasterObjectI {
    public List getProperties();
    public String getSTP();
    public List getPropertiesForSpecialCaseHandling();
    public ResponseMasterObjectI getResponseObj();  
    
}
