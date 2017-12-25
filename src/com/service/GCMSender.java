/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.service;

import com.clientRequest.GCMParam;
import com.clientRequest.LoginParam;
import com.google.android.gcm.server.Message;
import com.google.android.gcm.server.Result;
import com.google.android.gcm.server.Sender;
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
@Path("/GCM")
public class GCMSender {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GCMSender
     */
    public GCMSender() {
    }

    /**
     * Retrieves representation of an instance of com.service.GCMSender
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    public String getJson() {
        //TODO return proper representation object
        return "{\"success\"}";
    }

    /**
     * PUT method for updating or creating an instance of GCMSender
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public String putJson(String content) {
        
      	// Put your Google API Server Key here
	
	String MESSAGE_KEY = "Message";	  
        System.out.println("In post Json-->"+content);
        GCMParam gCMParam=(GCMParam)JsonUtilities.convertJsonToObj(content, GCMParam.class);
        
         
		Result result = null;
                String GOOGLE_SERVER_API_KEY="AIzaSyCIeuVPXMizNu6Qf-Ppw02-AHitQvMShxw";
               System.out.println("RegKey-->"+gCMParam.getKey()); 
               System.out.println("Server API Key-->"+GOOGLE_SERVER_API_KEY); 
		// GCM RedgId of Android device to send push notification
		try {
	
				Sender sender = new Sender(GOOGLE_SERVER_API_KEY);
				Message message = new Message.Builder().timeToLive(30)
				.delayWhileIdle(true).addData(MESSAGE_KEY, "Test Message sent by jagan").build();
				result = sender.send(message, gCMParam.getKey(), 1);
				
			} 
                        catch(Exception e)
                        {
                            System.out.println("Exception-->"+e);
                                    
                        }
		
	return "{\"response\":\"success\"}" ;
    }
}
