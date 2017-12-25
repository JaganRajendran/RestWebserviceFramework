/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.clientRequest;

import com.clientResponse.ResponseMasterObjectI;
import com.clientResponse.RetUnReadMsgsResponse;
import com.constants.STPConstants;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jagan
 */
public class RetUnReadMsgsParam implements RequestMasterObjectI{
    
    private int fromUserID;
    private int toUserId;
    private String source;
    
    
    

    public int getFromUserID() {
        return fromUserID;
    }

    public void setFromUserID(int fromUserID) {
        this.fromUserID = fromUserID;
    }

    public int getToUserId() {
        return toUserId;
    }

    public void setToUserId(int toUserId) {
        this.toUserId = toUserId;
    }

    
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String getSTP() {
        return STPConstants.RETUNREADMSGS_STP;
    }

    @Override
    public List getPropertiesForSpecialCaseHandling() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseMasterObjectI getResponseObj() {
        return new RetUnReadMsgsResponse();
    }
    @Override
    public List getProperties() {
       ArrayList propertiesList=new ArrayList(); 
       propertiesList.add(this.getFromUserID());
       propertiesList.add(this.getToUserId());
       //propertiesList.add(this.getSource());
       return propertiesList;
    }
    
}
