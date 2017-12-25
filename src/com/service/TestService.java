/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.service;

import com.clientResponse.TestResponse;
import com.utilities.JsonUtilities;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
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
@Path("Test")
public class TestService {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of TestService
     */
    public TestService() {
    }

    /**
     * Retrieves representation of an instance of com.service.TestService
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    public String getJson() {
        List<TestResponse> testrespList=new ArrayList<TestResponse>();
        TestResponse testresponse1=new TestResponse();
        testresponse1.setTitle("softEng");
        testresponse1.setDescription("Passionate Job");
        TestResponse testresponse2=new TestResponse();
        testresponse2.setTitle("auditing");
        testresponse2.setDescription("Not a bad Job");
        testrespList.add(testresponse1);
        testrespList.add(testresponse2);
        return JsonUtilities.convertObjToJson(testrespList);
        
    }

    /**
     * PUT method for updating or creating an instance of TestService
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/json")
    public void putJson(String content) {
    }
}
