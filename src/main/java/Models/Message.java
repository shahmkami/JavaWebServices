/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Siraj
 */
@XmlRootElement
public class Message {
    private int id;
    private String text;
    private String user;
    
    public Message(){}
    public Message(int id,String text,String user){
        this.id=id;
        this.text=text;
        this.user=user;    
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String Text) {
        this.text = Text;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    
}