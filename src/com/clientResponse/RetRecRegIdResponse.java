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
public class RetRecRegIdResponse implements ResponseMasterObjectI{
    private String recRegId;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
    private String source;
    

    public String getRecRegId() {
        return recRegId;
    }

    public void setRecRegId(String recRegId) {
        this.recRegId = recRegId;
    }
    
    @Override
    public void setProperties(String[] data) {
       this.setRecRegId(data[0]);
       this.setSource(data[1]);
    }
    
}
