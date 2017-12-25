/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.service;

import com.clientRequest.ChngPWdParam;
import com.clientRequest.ForgotPwdParam;
import com.clientResponse.CommonStatusResponse;
import com.clientResponse.ForgorPwdResponse;
import com.communicator.DBCommunicator;
import com.utilities.EmailSender;
import com.utilities.JsonUtilities;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
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
@Path("ForgotPwd")
public class ForgotPwdService {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ForgotPwdService
     */
    public ForgotPwdService() {
    }

    /**
     * Retrieves representation of an instance of com.service.ForgotPwdService
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    public String getJson() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of ForgotPwdService
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public String putJson(String content) {
        
        ForgotPwdParam forgotPwdParam=(ForgotPwdParam)JsonUtilities.convertJsonToObj(content, ForgotPwdParam.class);
        DBCommunicator dbComm=new DBCommunicator();    
        String result = "";
        result = dbComm.getJsonResponseForService(forgotPwdParam);
//        ForgorPwdResponse r = (ForgorPwdResponse) JsonUtilities.convertJsonToObj(result, ForgorPwdResponse.class);
//        EmailSender emailSender = new EmailSender();
//        //emailSender.sendEmail("sivaprakash.sriram@gmail.com", result, content);
//        emailSender.sendEmail(r.getMailID(), "Login Password", r.getTmpPwd());
        if (result != "")
        {
            CommonStatusResponse commonStatusResponse=new CommonStatusResponse();
            commonStatusResponse.setStatus("success");
            result = JsonUtilities.convertObjToJson(commonStatusResponse); 
        }
        return result;
    }
}
