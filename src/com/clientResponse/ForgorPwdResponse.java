/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.clientResponse;

/**
 *
 * @author Sivaprakash
 */
public class ForgorPwdResponse implements ResponseMasterObjectI{
    private String UserName;

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getMailID() {
        return MailID;
    }

    public void setMailID(String MailID) {
        this.MailID = MailID;
    }

    public String getTmpPwd() {
        return TmpPwd;
    }

    public void setTmpPwd(String TmpPwd) {
        this.TmpPwd = TmpPwd;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String UserID) {
        this.UserID = UserID;
    }
    private String MailID;
    private String TmpPwd;
    private String UserID;
    
    @Override
    public void setProperties(String[] data) {
       UserName = data[0];
       MailID = data[1];
       TmpPwd   = data[2];
       UserID = data[3];
    }
    
}
