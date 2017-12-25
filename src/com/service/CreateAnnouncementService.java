/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.service;

import com.clientRequest.CreateAnnouncementParam;
import com.communicator.DBCommunicator;
import com.utilities.JsonUtilities;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;

/**
 * REST Web Service
 *
 * @author Jagan
 */
@Path("CreateAnnouncement")
public class CreateAnnouncementService {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of CreateAnnouncementService
     */
    public CreateAnnouncementService() {
    }

    /**
     * Retrieves representation of an instance of com.service.CreateAnnouncementService
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    public String getJson() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of CreateAnnouncementService
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
   @POST
    @Consumes("application/json")
   @Produces("application/json")
    public String putJson(String content) {
        CreateAnnouncementParam createAnnouncementParam=(CreateAnnouncementParam)JsonUtilities.convertJsonToObj(content, CreateAnnouncementParam.class);
        DBCommunicator dbComm=new DBCommunicator();
        return dbComm.getJsonResponseForService(createAnnouncementParam);
    
    }
}
