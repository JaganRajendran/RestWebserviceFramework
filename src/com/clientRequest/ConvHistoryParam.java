/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.clientRequest;

import com.clientResponse.ConvHistoryResponse;
import com.clientResponse.ResponseMasterObjectI;
import com.constants.STPConstants;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jagan
 */
public class ConvHistoryParam implements RequestMasterObjectI{
    private int fromUserID;
    private int toUserId;
    private int lastMsgId;
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

    public int getLastMsgId() {
        return lastMsgId;
    }

    public void setLastMsgId(int lastMsgId) {
        this.lastMsgId = lastMsgId;
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
       propertiesList.add(this.getFromUserID());
       propertiesList.add(this.getToUserId());
       propertiesList.add(this.getLastMsgId());
       //propertiesList.add(this.getSource());
       return propertiesList;
    }

    @Override
    public String getSTP() {
        return STPConstants.CONVHISTORY_STP;
    }

    @Override
    public List getPropertiesForSpecialCaseHandling() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseMasterObjectI getResponseObj() {
        return new ConvHistoryResponse();
    }
    
    
    
}
