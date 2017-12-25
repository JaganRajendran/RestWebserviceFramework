/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.clientResponse;

/**
 *
 * @author Jagan
 */
public class RetUnReadMsgsResponse implements ResponseMasterObjectI{

    private int msgId;
    private String msg;
    private int senderId;

    public int getMsgId() {
        return msgId;
    }

    public void setMsgId(int msgId) {
        this.msgId = msgId;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getSenderId() {
        return senderId;
    }

    public void setSenderId(int senderId) {
        this.senderId = senderId;
    }
    
    @Override
    public void setProperties(String[] data) {
        this.setSenderId(data[0]!=null||data[0]!=""?Integer.parseInt(data[0]):0);
        this.setMsg(data[1]);
        this.setMsgId(data[2]!=null||data[2]!=""?Integer.parseInt(data[2]):0);
    }
    
}
