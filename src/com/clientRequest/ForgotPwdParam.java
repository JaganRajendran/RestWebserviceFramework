/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.clientRequest;

import com.clientResponse.ResponseMasterObjectI;
import com.clientResponse.ForgorPwdResponse;
import com.constants.STPConstants;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jagan
 */
public class ForgotPwdParam implements RequestMasterObjectI{
    
    private String emaiIdOrUserName;
    private String source;

    public String getEmaiIdOrUserName() {
        return emaiIdOrUserName;
    }

    public void setEmaiIdOrUserName(String emaiIdOrUserName) {
        this.emaiIdOrUserName = emaiIdOrUserName;
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
       propertiesList.add(this.getEmaiIdOrUserName());
       return propertiesList;
    }

    @Override
    public String getSTP() {
       return STPConstants.FORGOTPWD_STP;
    }

    @Override
    public List getPropertiesForSpecialCaseHandling() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseMasterObjectI getResponseObj() {
        return new ForgorPwdResponse();
    }
}
