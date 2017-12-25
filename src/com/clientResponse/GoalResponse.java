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
public class GoalResponse implements ResponseMasterObjectI{
    private String title;
    private String description;
    
        public String gettitle() {
        return title;
    }
    public void settitle(String title) {
        this.title = title;
    }
    
    public String getdescription() {
        return description;
    }
    public void setdescription(String description) {
        this.description = description;
    }

    @Override
    public void setProperties(String[] data) {
        this.title = data[0];
        this.description = data[1];
    }
    
}
