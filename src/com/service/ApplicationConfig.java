/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author Jagan
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(com.service.AckRecMsgService.class);
        resources.add(com.service.AnnouncementService.class);
        resources.add(com.service.ChatLoadService.class);
        resources.add(com.service.ChngPwdService.class);
        resources.add(com.service.ConvHistoryService.class);
        resources.add(com.service.CreateAnnouncementService.class);
        resources.add(com.service.ForgotPwdService.class);
        resources.add(com.service.GCMSender.class);
        resources.add(com.service.GoalService.class);
        resources.add(com.service.LoginService.class);
        resources.add(com.service.MemSearchService.class);
        resources.add(com.service.ProfileViewService.class);
        resources.add(com.service.RecieveMsgService.class);
        resources.add(com.service.RegIdUpdService.class);
        resources.add(com.service.RetRecRegIdService.class);
        resources.add(com.service.RetUnReadMsgsService.class);
        resources.add(com.service.SelectContactService.class);
        resources.add(com.service.SendMsgService.class);
        resources.add(com.service.TestService.class);
        resources.add(com.service.ViewMsgService.class);
    }
    
}
