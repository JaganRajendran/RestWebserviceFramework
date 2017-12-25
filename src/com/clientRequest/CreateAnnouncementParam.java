/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.clientRequest;

import com.clientResponse.CommonStatusResponse;
import com.clientResponse.ResponseMasterObjectI;
import com.constants.STPConstants;
import com.utilities.SQLDateConverter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jagan
 */
public class CreateAnnouncementParam implements RequestMasterObjectI{
    
    private String eventName;
    private String time;
    private String date;
    private String location;
    private String description;
    private int adminId;
    private String source;

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
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
       propertiesList.add(this.getEventName());
       propertiesList.add(SQLDateConverter.ConvertStringToSQLDate(this.getDate()));
       propertiesList.add(this.getTime());
       propertiesList.add(this.getLocation());
       propertiesList.add(this.getDescription());
       propertiesList.add(this.getAdminId());
       return propertiesList;
    }

    @Override
    public String getSTP() {
        return STPConstants.CREATEANNOUNCEMENTS_STP;
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
