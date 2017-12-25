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
public class ProfileViewResponse implements ResponseMasterObjectI {
    private String first_name;
    private String last_name;
    private String major;
    private String academic_year;
    private String bio;
    private String profile_pic;

    @Override
    public void setProperties(String[] data) {
        first_name = data[0];
        last_name = data[1];
        major = data[2];
        academic_year = data[3];
        bio = data[4];
        profile_pic = data[5];
        
    }
    
}
