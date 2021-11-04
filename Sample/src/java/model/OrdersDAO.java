/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author bacon
 */
public class OrdersDAO extends MyDAO {

    public void insertOrders(orders x) {
        xSql = "insert into ORDERS values (?,?)";
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, x.getUser());
            ps.setInt(2, x.getTotal());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateorder(String money, String id) {
        xSql = "update ORDERS set money=? where id=?";
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, money);
            ps.setString(2, id);

            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return;
    }

    public void deleteOrder(String id) {
        xSql = "delete from ORDERS where id=?";
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, id);
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     public String getOrder() {

        xSql = "Select max(id) from ORDERS ";
        int id;
      
       String x="";
        try {
            ps = con.prepareStatement(xSql);           
            rs = ps.executeQuery();
            if (rs.next()) {
                id = rs.getInt(1);
                x=Integer.toString(id);
                 
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
       
       return x;
    }
      public ArrayList<orders> getOrders() {
        ArrayList<orders> t = new ArrayList<>();
        xSql = "select * from ORDERS where money>0";
        String user;
        int money;
        int id;       
        orders x;
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            while (rs.next()) { 
                id=rs.getInt("id");
                user = rs.getString("user");                
                money=rs.getInt("money");
                x = new orders(id, user, money);
                t.add(x);
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (t);
    }

    public static void main(String[] args) {
        OrdersDAO u = new OrdersDAO();
        u.getOrders();
        
    }
}
