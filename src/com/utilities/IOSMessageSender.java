/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.utilities;

import com.constants.APNSConstants;
import javapns.Push;


/**
 *
 * @author Jagan
 */
public class IOSMessageSender {
    
     public static void sendNotificationOrMessage(String msg,String deviceToken)   
     {  
       try {  
          Push.alert(msg, APNSConstants.KEYSTORE, APNSConstants.PASSWORD, APNSConstants.PRODUCTION, deviceToken);
       }   
       catch (Exception e) {  
             
       }     
    }  
    /*

    private static final String HOST = "gateway.sandbox.push.apple.com";  
  

    private static final int PORT = 2195;  
     PayLoad payLoad = new PayLoad();  
           payLoad.addAlert("My alert message");  
           payLoad.addBadge(45);  
           payLoad.addSound("default");  
  
           PushNotificationManager pushManager =   
              PushNotificationManager.getInstance();  
  
           pushManager.addDevice("iPhone", deviceToken);  
  
           
  
           // Connect to APNs  
           pushManager.initializeConnection(HOST, PORT,  
           "/etc/Certificates.p12", "password",   
           SSLConnectionHelper.KEYSTORE_TYPE_PKCS12);  
  
           Device client = pushManager.getDevice("iPhone");  
  
           // Send Push  
           
           pushManager.sendNotification(client, payLoad);  
           pushManager.stopConnection();  */
    
}
