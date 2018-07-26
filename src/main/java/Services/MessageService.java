/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Models.Message;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Siraj
 */

public class MessageService {
    public List<Message> messages=new ArrayList<>();
        
    public List<Message> getAllMessages(){
        //List<Message> messages=new ArrayList<>();
        Message m1=new Message(1,"here it is!","holowitz");
        Message m2=new Message(2,"I  exits and moving on","Sheldon");
        messages.add(m1);
        messages.add(m2);
        return messages;
    }
    public Message addMessage(Message message){
       messages.add(message);    
       return message;
    }
    
//    public Message getMessage(){
//        Message m1=new Message(1,"this is third message","Elliot");
//        messages.add(m1);
//        return messages.get(0);
//    }
    
}
