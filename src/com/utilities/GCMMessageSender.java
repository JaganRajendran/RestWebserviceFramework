/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.utilities;

import com.constants.GCMConstants;
import com.google.android.gcm.server.Message;
import com.google.android.gcm.server.Result;
import com.google.android.gcm.server.Sender;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jagan
 */
public class GCMMessageSender {
    public static void sendNotificationOrMessage(String msg,String regId)
    {
        try {
            Result result = null;
            Sender sender = new Sender(GCMConstants.GOOGLE_SERVER_API_KEY);
            Message message = new Message.Builder().timeToLive(60)
                    .delayWhileIdle(true).addData(GCMConstants.MESSAGE_KEY, msg).build();
            result = sender.send(message,regId, 1);
            System.out.println("MsgId"+result.getMessageId());
            System.out.println("ErrorCode"+result.getErrorCodeName());
            System.out.println("Canonical"+result.getCanonicalRegistrationId());
         } catch (IOException ex) {
            Logger.getLogger(GCMMessageSender.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
