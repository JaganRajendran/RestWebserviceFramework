/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.service;


import com.clientRequest.GoalsParam;
import com.communicator.DBCommunicator;
import com.utilities.JsonUtilities;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import com.clientResponse.GoalResponse;
/**
 * REST Web Service
 *
 * @author Jagan
 */
@Path("Goals")
public class GoalService {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GoalService
     */
    public GoalService() {
    }

    /**
     * Retrieves representation of an instance of com.service.GoalService
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    public String getJson(String content) {
        return "hi";
    }

    /**
     * PUT method for updating or creating an instance of GoalService
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public String putJson(String content) {
        
      GoalsParam goalsParam=(GoalsParam)JsonUtilities.convertJsonToObj(content, GoalsParam.class);
      DBCommunicator dbComm=new DBCommunicator();   
      return dbComm.getJsonResponseForService(goalsParam);
    }
    
}
