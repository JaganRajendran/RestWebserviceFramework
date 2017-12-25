/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.clientRequest;

import com.clientResponse.ResponseMasterObjectI;
import com.constants.STPConstants;
import java.util.ArrayList;
import java.util.List;
import com.clientResponse.ProfileViewResponse;

/**
 *
 * @author Jagan
 */
public class ProfileViewParam implements RequestMasterObjectI{
    private int userName;
    private String source;

    public Integer getUserName() {
        return userName;
    }

    public void setUserName(Integer userName) {
        this.userName = userName;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
    
    @Override
    public List getProperties() {
       ArrayList propertiesList=new ArrayList(); 
        propertiesList.add(this.getUserName());
       return propertiesList;
    }

    @Override
    public String getSTP() {
     return STPConstants.PROF_STP;
    }

    @Override
    public List getPropertiesForSpecialCaseHandling() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseMasterObjectI getResponseObj() {
        return new ProfileViewResponse();
    }
    
}
