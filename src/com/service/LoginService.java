/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.service;

import com.clientRequest.LoginParam;
import com.communicator.DBCommunicator;
import com.utilities.JsonUtilities;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

/**
 * REST Web Service
 *
 * @author Jagan  
 */
@Path("Login")
public class LoginService {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of LoginService
     */
    public LoginService() {
    }

    /**
     * Retrieves representation of an instance of com.service.LoginService
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    public String getJson() {
        //TODO return proper representation object
        
        
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of LoginService
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @POST
    @Produces("application/json")
    @Consumes("application/json")
    public String putJson(String content) {
        LoginParam loginParam=(LoginParam)JsonUtilities.convertJsonToObj(content, LoginParam.class);
        DBCommunicator dbComm=new DBCommunicator();     
        return dbComm.getJsonResponseForService(loginParam);
    } 
}
