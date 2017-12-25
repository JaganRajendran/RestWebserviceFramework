/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.clientResponse;

import com.constants.URLConstants;
import com.utilities.UniversitySelector;

/**
 *
 * @author Sivaprakash
 */
public class LoginResponse implements ResponseMasterObjectI{
    private int userId;
    private String firstName;

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUnivProfPic() {
        return univProfPic;
    }

    public void setUnivProfPic(String univProfPic) {
        this.univProfPic = univProfPic;
    }
    private String userType;
    private String univProfPic;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public boolean isTmp() {
        return tmp;
    }

    public void setTmp(boolean tmp) {
        this.tmp = tmp;
    }
    private String lastName;
    private String major;
    private String bio;
    private String profilePic;
    private String university;
    private String academicYr;

    public String getAcademicYr() {
        return academicYr;
    }

    public void setAcademicYr(String academicYr) {
        this.academicYr = academicYr;
    }
    private boolean tmp;
    @Override
    public void setProperties(String[] data) {
        userId = data[0]!=""?Integer.parseInt(data[0]):0;
        firstName = data[1];
        lastName = data[2];
        major = data[3];
        bio = data[4];
        profilePic = data[5];
        //profilePic = URLConstants.baseURL+UniversitySelector.getUniversity(data[6])+data[5];
        university = data[6];
        academicYr = data[7];
        userType=data[8];
        univProfPic=data[9]; 
        tmp = Boolean.parseBoolean(data[10]);
    }
    
}
