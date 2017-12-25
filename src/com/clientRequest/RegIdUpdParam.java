/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.clientRequest;

import com.clientResponse.CommonStatusResponse;
import com.clientResponse.RegIdUpdResponse;
import com.clientResponse.ResponseMasterObjectI;
import com.constants.STPConstants;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jagan
 */
public class RegIdUpdParam implements RequestMasterObjectI{
    private String regId;

    public String getRegId() {
        return regId;
    }

    public void setRegId(String regId) {
        this.regId = regId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
    private String userId;
    private String source;
    

    @Override
    public List getProperties() {
          ArrayList propertiesList=new ArrayList(); 
       propertiesList.add(this.getUserId());
       propertiesList.add(this.getRegId());
       propertiesList.add(this.getSource());
       return propertiesList;
    }

    @Override
    public String getSTP() {
        return STPConstants.REGIDUPD_STP;
    }

    @Override
    public List getPropertiesForSpecialCaseHandling() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseMasterObjectI getResponseObj() {
        return new CommonStatusResponse();
    }
    
}
