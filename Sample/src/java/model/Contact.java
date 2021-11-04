/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author bacon
 */
public class Contact {
    int id;String user,email,mess;

    public Contact(int id, String user, String email, String mess) {
        this.id = id;
        this.user = user;
        this.email = email;
        this.mess = mess;
    }

    public Contact(String user, String email, String mess) {
        this.user = user;
        this.email = email;
        this.mess = mess;
    }

    public Contact() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMess() {
        return mess;
    }

    public void setMess(String mess) {
        this.mess = mess;
    }

    @Override
    public String toString() {
        return "Contact{" + "id=" + id + ", user=" + user + ", email=" + email + ", mess=" + mess + '}';
    }

  
    
}
