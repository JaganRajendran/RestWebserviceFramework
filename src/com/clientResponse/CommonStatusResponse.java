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
public class CommonStatusResponse implements ResponseMasterObjectI{

    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public void setProperties(String[] data) {
        this.setStatus(data[0]);
    }
    
}
