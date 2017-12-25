    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.service;

import com.clientRequest.ConvHistoryParam;
import com.clientRequest.ViewMsg;
import com.clientResponse.ConvHistoryResponse;
import com.communicator.DBCommunicator;
import com.constants.GCMConstants;
import com.utilities.JsonUtilities;
import java.util.ArrayList;
import java.util.List;
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
@Path("GCMConvHist")
public class ConvHistoryService {

    @Context
    private UriInfo context;
    private int msgId=GCMConstants.msgId;
    private int senderId=1;

    /**
     * Creates a new instance of ConvHistoryService
     */
    public ConvHistoryService() {
    }

    /**
     * Retrieves representation of an instance of com.service.ConvHistoryService
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    public String getJson() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of ConvHistoryService
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public String putJson(String content) {
        ConvHistoryParam convHistory=(ConvHistoryParam)JsonUtilities.convertJsonToObj(content, ConvHistoryParam.class);
        DBCommunicator dbComm=new DBCommunicator();     
        return dbComm.getJsonResponseForService(convHistory);
       /* List<ConvHistRespone> convHisrtRespList=new ArrayList<ConvHistRespone>();
        for(int i=0;i<15;i++)
        {
            convHisrtRespList.add(getList());
        }       
        GCMConstants.msgId=msgId;
        return JsonUtilities.convertObjToJson(convHisrtRespList);*/
    }
    private ConvHistoryResponse getList()
    {
        ConvHistoryResponse cp=new ConvHistoryResponse();
        cp.setMsg("msg"+msgId);
        cp.setMsgId(msgId);
        cp.setSenderId(senderId==1?1:2);
//        cp.setTimeStamp("Not required now");
        msgId++;
        senderId=(senderId==1?2:1);
        return cp;
    }
}
