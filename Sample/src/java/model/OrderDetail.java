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
public class OrderDetail {
    int oid;String user,name; int quantity;

    public OrderDetail() {
    }

    public OrderDetail(int oid, String user, String name, int quantity) {
        this.oid = oid;
        this.user = user;
        this.name = name;
        this.quantity = quantity;
    }
    

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "OrderDetail{" + "oid=" + oid + ", user=" + user + ", name=" + name + ", quantity=" + quantity + '}';
    }
    
}
