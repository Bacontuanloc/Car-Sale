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
public class orders {
    int id; String user; int total;

    public orders(String user, int total) {
        this.user = user;
        this.total = total;
    }

    public orders(int id, String user, int total) {
        this.id = id;
        this.user = user;
        this.total = total;
    }
    

    public orders() {
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

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "orders{" + "id=" + id + ", user=" + user + ", total=" + total + '}';
    }
    
}
