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
public class OrderDetailDAO  extends MyDAO{
    
     public void insertOrderDetail(String oid,String user,String name,String quantity) {
        xSql = "insert into OrderDetail values (?,?,?,?)";
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, oid);
            ps.setString(2, user);
            ps.setString(3, name);
             ps.setString(4, quantity);
             
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
       public void updateDetale(String quantity, String oid,String name) {
        xSql = "update OrderDetail set quantity=? where oid=? and name=?";
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, quantity);
            ps.setString(2, oid);
            ps.setString(3, name);

            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return;
    }

    public void deleteorderdetail(String oid,String name) {
        xSql = "delete from OrderDetail where oid=? and name=?";
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, oid);
            ps.setString(2, name);
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     public ArrayList<OrderDetail> getOrderDetails() {
        ArrayList<OrderDetail> t = new ArrayList<>();
        xSql = "select * from OrderDetail order by oid asc";
        int oid;
        String user;
        String name;
        int quantity;       
        OrderDetail x;
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            while (rs.next()) { 
                oid=rs.getInt("oid");
                user = rs.getString("user");   
                name = rs.getString("name");   
                quantity=rs.getInt("quantity");
                x = new OrderDetail(oid, user, name, quantity);
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
       OrderDetailDAO u= new OrderDetailDAO();
ArrayList<OrderDetail> list= u.getOrderDetails();
         for (OrderDetail orderDetail : list) {
             System.out.println(orderDetail);
         }
        
       
    }
}
