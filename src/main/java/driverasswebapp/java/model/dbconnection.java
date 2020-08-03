/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driverasswebapp.java.model;

import java.sql.*;
/**
 *
 * @author ammar
 */
public class dbconnection {
    
    private static Connection con;
    
    public static Connection getConnection(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/driverapp","root","Spencer.nk375");
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }
    
}
