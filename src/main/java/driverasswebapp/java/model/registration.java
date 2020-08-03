/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driverasswebapp.java.model;

/**
 *
 * @author ammar
 */
public class registration {
    
    int id;
    String fullname;
    String email;
    String address;
    String dob;
    String register;
    String password;

    public registration() {
    }

    public registration(int id, String fullname, String email, String address, String dob, String register, String password) {
        this.id = id;
        this.fullname = fullname;
        this.email = email;
        this.address = address;
        this.dob = dob;
        this.register = register;
        this.password = password;
    }

    public registration(String fullname, String email, String address, String dob, String register, String password) {
        this.fullname = fullname;
        this.email = email;
        this.address = address;
        this.dob = dob;
        this.register = register;
        this.password = password;
    }

    public registration(String email, String address, String dob, String register, String password) {
        this.email = email;
        this.address = address;
        this.dob = dob;
        this.register = register;
        this.password = password;
    }

    public registration(String address, String dob, String register, String password) {
        this.address = address;
        this.dob = dob;
        this.register = register;
        this.password = password;
    }
    
    public registration(String dob, String register, String password) {
        this.dob = dob;
        this.register = register;
        this.password = password;
    }
    
    public registration(String register, String password) {
        this.register = register;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
