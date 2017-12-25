 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.utilities;
import java.io.UnsupportedEncodingException;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


/**
 *
 * @author Jagan
 */
public class EmailSender {
    
    public void sendEmail(String toAddress,String headerText, String bodyText)
    {
        Properties props = new Properties();
Session session = Session.getDefaultInstance(props, null);

String msgBody = "...";

try {
    Message msg = new MimeMessage(session);
    msg.setFrom(new InternetAddress("xxx@google.com"));
    msg.addRecipient(Message.RecipientType.TO,
     new InternetAddress(toAddress));
    msg.setSubject("Test Mail");
    msg.setText(msgBody);
    Transport.send(msg);

} catch (AddressException e) {
    // ...
} catch (MessagingException e) {
    // ...
}

    }
    public static void main(String args[])
    {
        EmailSender emailSender=new EmailSender();
        emailSender.sendEmail(null, null, null);
        System.out.println("Email Sent");
    }
    
}
