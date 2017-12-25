/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.clientResponse;

import com.constants.URLConstants;

/**
 *
 * @author Sivaprakash
 */
public class MemSearchResponse implements ResponseMasterObjectI{

    String firstName;
    String lastName;
    String major;
    String academicYr;
    String university;
    String userid;
    String bio;
    String profilePic;

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

    public String getUniversityPic() {
        return universityPic;
    }

    public void setUniversityPic(String universityPic) {
        this.universityPic = universityPic;
    }
    String universityPic;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
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

    public String getAcademicYr() {
        return academicYr;
    }

    public void setAcademicYr(String academicYr) {
        this.academicYr = academicYr;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
    
    @Override
    public void setProperties(String[] data) {
        this.setFirstName(data[0]);
        this.setLastName(data[1]);
        this.setMajor(data[2]);
        this.setAcademicYr(data[3]);
        this.setUniversity(data[4]);
        this.setUserid(data[5]);
        this.setBio(data[6]);
        this.setProfilePic(URLConstants.baseURL+data[7]);
        this.setUniversityPic(data[8]);
    }
    
}
