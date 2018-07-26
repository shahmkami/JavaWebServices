/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Models.Message;
import database.DatabaseClass;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Siraj
 */

public class MessageService {
    //public List<Message> messages=new ArrayList<>();
    private Map<String,Message> messages=DatabaseClass.getMessages();
    public List<Message> getAllMessages(){
        //List<Message> messages=new ArrayList<>();
        Message m1=new Message(1,"here it is!","holowitz");
        Message m2=new Message(2,"I  exits and moving on","Sheldon");
        messages.put("1",m1);
        messages.put("2",m2);
        return new ArrayList<Message>(messages.values());
    }
    public Message addMessage(String id,Message message){
       messages.put(id,message);    
       return message;
    }
    
//    public Message getMessage(){
//        Message m1=new Message(1,"this is third message","Elliot");
//        messages.add(m1);
//        return messages.get(0);
//    }
    
}
