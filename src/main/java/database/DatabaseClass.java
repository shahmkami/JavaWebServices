/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import Models.Message;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Siraj
 */
public class DatabaseClass {
    private static Map<String,Message> messages=new HashMap<>();
    
    public static Map<String,Message> getMessages(){
        return messages;    
    }
    
}
