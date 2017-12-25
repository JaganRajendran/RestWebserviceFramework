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
import com.clientResponse.MemSearchResponse;

/**
 *
 * @author Jagan
 */
public class MemSearchParam implements RequestMasterObjectI{
    
    private String userType;
    private String firstName;
    private String lastName;
    private String nofItemsMax;
    private String lastUserName;
    private String source;
    private int userId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
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

    public String getNofItemsMax() {
        return nofItemsMax;
    }

    public void setNofItemsMax(String nofItemsMax) {
        this.nofItemsMax = nofItemsMax;
    }

    public String getLastUserName() {
        return lastUserName;
    }

    public void setLastUserName(String lastUserName) {
        this.lastUserName = lastUserName;
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
       propertiesList.add(this.getFirstName());
       propertiesList.add(this.getLastName());
       propertiesList.add(this.getUserId());
       propertiesList.add(this.getUserType());
       return propertiesList;
    }

    @Override
    public String getSTP() {
      return STPConstants.MEMSEARCH_STP;
    }

    @Override
    public List getPropertiesForSpecialCaseHandling() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseMasterObjectI getResponseObj() {
        return new MemSearchResponse();
    }
}
