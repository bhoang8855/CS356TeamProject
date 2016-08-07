/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs365teamproject;

/**
 *
 * @author Aileen
 */
public class Employee {
    private int id; 
    private String username, password;
    
    public Employee(int ID, String user, String pass){
        this.id = ID;
        this.username = user;
        this.password = pass;
    }
    
    public int getId(){
        return id;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    
    
    
}
