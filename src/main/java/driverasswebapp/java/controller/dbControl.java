/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driverasswebapp.java.controller;

import driverasswebapp.java.model.registration;
import java.sql.*;

/**
 *
 * @author ammar
 */

public class dbControl {
    
    Connection con ;

    public dbControl(Connection con) {
        this.con = con;
    }
    
    //for register a user 
    public boolean saveUser(registration registration){
        
        boolean set = false;
        try{
           //Insert register data to database
           String query = "insert into register(fullname,email,address,dob,register,password) values(?,?,?,?,?,?)";
           
           PreparedStatement pt = this.con.prepareStatement(query);
           pt.setString(1, registration.getFullname());
           pt.setString(2, registration.getEmail());
           pt.setString(3, registration.getAddress());
           pt.setString(4, registration.getDob());
           pt.setString(5, registration.getRegister());
           pt.setString(6, registration.getPassword());
           
           pt.executeUpdate();
           set = true;
        }
        
        catch(Exception e){
            e.printStackTrace();
        }
        return set;
    }
    
}
