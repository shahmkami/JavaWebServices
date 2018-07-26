/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webservices;

import Models.Message;
import Services.MessageService;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import static javax.ws.rs.HttpMethod.POST;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Siraj
 */

@Path("/messages")
public class MessageResource {
    MessageService ms=new MessageService();
    
//    @GET
//    @Produces(MediaType.APPLICATION_XML)
//    public List<Message> getMessages(){
//        return ms.getAllMessages();
//    }
    
//    @GET
//    @Path("/messageid")
//    @Produces(MediaType.APPLICATION_XML)
//    public Message getMessage(){
//        return ms.getMessage();
//    }

//    @GET
//    @Path("/{param}")
//    @Produces(MediaType.TEXT_PLAIN)
//    public String getParam(@PathParam("param") String param){
//        List<Message> messages=ms.getAllMessages();
//        
//        return "got it!"+param;
//    }
    
//    @GET
//    @Path("/{param}")
//    @Produces(MediaType.APPLICATION_XML)
//    public Message getModel(@PathParam("param") int param){
//        List<Message> messages=ms.getAllMessages();
//        return messages.get(param);
//    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Message> getAllMessages(){
        List<Message> messages=ms.getAllMessages();
        return messages;
    }
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Message sendMessage(Message message){
        return ms.addMessage(message);
    }
    
    @GET
    @Path("/{json}")
    @Produces(MediaType.APPLICATION_JSON)
    public Message getMessage(@PathParam("json") int json){
        List<Message> messages=ms.getAllMessages();
        return messages.get(json);
    }
    @GET
    @Path("/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public String dec(@PathParam("id") int id){
        if(id==1){
            return "one";
        }else return "not one";
    }
    
}