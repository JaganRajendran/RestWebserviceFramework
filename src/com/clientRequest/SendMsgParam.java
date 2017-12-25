/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.clientRequest;

import com.clientResponse.ResponseMasterObjectI;
import com.clientResponse.CommonStatusResponse;
import com.constants.STPConstants;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jagan
 */
public class SendMsgParam implements RequestMasterObjectI{
    
    private int userName;
    private int toUserName;
    private String userRegId;
    private String toUserRegId;
    private String source;
    private String msg;
    private String sendUserProfName;

    public String getSendUserProfName() {
        return sendUserProfName;
    }

    public void setSendUserProfName(String sendUserProfName) {
        this.sendUserProfName = sendUserProfName;
    }

    public String getUserRegId() {
        return userRegId;
    }

    public void setUserRegId(String userRegId) {
        this.userRegId = userRegId;
    }

    public String getToUserRegId() {
        return toUserRegId;
    }

    public void setToUserRegId(String toUserRegId) {
        this.toUserRegId = toUserRegId;
    }
  

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getUserName() {
        return userName;
    }

    public void setUserName(Integer userName) {
        this.userName = userName;
    }

    public Integer getToUserName() {
        return toUserName;
    }

    public void setToUserName(Integer toUserName) {
        this.toUserName = toUserName;
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
       propertiesList.add(this.getToUserName());
       propertiesList.add(this.getUserRegId());
       propertiesList.add(this.getToUserRegId());
       propertiesList.add(this.getMsg());
       return propertiesList;
    }

    @Override
    public String getSTP() {
       return STPConstants.MSGSEND_STP;
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
