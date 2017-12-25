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
public class AnnoucementResponse implements ResponseMasterObjectI{
    private String eventName;

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String Time) {
        this.Time = Time;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
    private String Time;
    private String Date;
    private String Location;
    private String Description;
    
    @Override
    public void setProperties(String[] data) {
        this.eventName = data[0];
        this.Time = data[1];
        this.Date = data[2];
        this.Location = data[3];
        this.Description = data[4];
    }
    
}
