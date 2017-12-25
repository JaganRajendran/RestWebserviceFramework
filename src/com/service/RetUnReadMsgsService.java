/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.service;

import com.clientRequest.RetRecRegIdParam;
import com.clientRequest.RetUnReadMsgsParam;
import com.communicator.DBCommunicator;
import com.utilities.JsonUtilities;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

/**
 * REST Web Service
 *
 * @author Jagan
 */
@Path("RetUnReadMsgs")
public class RetUnReadMsgsService {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of RetUnReadMsgsService
     */
    public RetUnReadMsgsService() {
    }

    /**
     * Retrieves representation of an instance of com.service.RetUnReadMsgsService
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    public String getJson() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of RetUnReadMsgsService
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @POST
    @Produces("application/json")
    @Consumes("application/json")
    public String putJson(String content) {      
        
        RetUnReadMsgsParam retUnReadMsgsParam=(RetUnReadMsgsParam)JsonUtilities.convertJsonToObj(content, RetUnReadMsgsParam.class);
        DBCommunicator dbComm=new DBCommunicator(); 
        String jsonOutput=dbComm.getJsonResponseForService(retUnReadMsgsParam);
        
        return jsonOutput;
    
    }
}
