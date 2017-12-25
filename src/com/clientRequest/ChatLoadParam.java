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

/**
 *
 * @author Jagan
 */
public class ChatLoadParam implements RequestMasterObjectI{
    private int userName;
    private int chatUser;
    private String lastStartIndex;
    private String stopIndex;
    private String source;

    public Integer getUserName() {
        return userName;
    }

    public void setUserName(Integer userName) {
        this.userName = userName;
    }

    public Integer getChatUser() {
        return chatUser;
    }

    public void setChatUser(Integer chatUser) {
        this.chatUser = chatUser;
    }

    public String getLastStartIndex() {
        return lastStartIndex;
    }

    public void setLastStartIndex(String lastStartIndex) {
        this.lastStartIndex = lastStartIndex;
    }

    public String getStopIndex() {
        return stopIndex;
    }

    public void setStopIndex(String stopIndex) {
        this.stopIndex = stopIndex;
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
       propertiesList.add(this.getChatUser());
       propertiesList.add(this.getLastStartIndex());
       propertiesList.add(this.getStopIndex());
       propertiesList.add(this.getSource());
       return propertiesList;
    }

    @Override
    public String getSTP() {
        return STPConstants.CHAT_STP;
    }

    @Override
    public List getPropertiesForSpecialCaseHandling() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseMasterObjectI getResponseObj() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
            
    
}
