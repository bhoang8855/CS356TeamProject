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
import java.sql.*;
import javax.swing.*;

public class MySqlConnect {
    Connection conn = null;
    
    public static Connection ConnectDB(){
        try{
            Class.forName("org.sqlite.JDBC");
            //Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Aileen\\Documents\\NetBeansProjects\\CS365TeamProject\\Employee.sqlite");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Aileen\\Documents\\NetBeansProjects\\CS365TeamProject\\Employees.sqlite");
            JOptionPane.showMessageDialog(null,"Connected to database");
            return conn;
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    } 
}
