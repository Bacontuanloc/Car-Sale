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
public class ContactDAO extends MyDAO{
     public void insertcontact(Contact x) {
     xSql = "insert into Contact values (?,?,?)"; 
     try {
      ps = con.prepareStatement(xSql);
      ps.setString(1, x.getUser());
      ps.setString(2, x.getEmail());
      ps.setString(3, x.getMess());
      ps.executeUpdate();
      ps.close();
     }     
     catch(Exception e) {
        e.printStackTrace();
     }
  }
     public ArrayList<Contact> getContact() {
        ArrayList<Contact> t = new ArrayList<>();
        xSql = "select * from Contact";
        int id;
        String user,email,mess;
        Contact x;
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                id=rs.getInt("ID");
                user = rs.getString("user");
                email =rs.getString("email");
                mess=rs.getString("inbox");
                x = new Contact(id, user, email, mess);
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
        ContactDAO cdao= new ContactDAO();
               ArrayList<Contact> x= cdao.getContact();
               for (Contact contact : x) {
                   System.out.println(contact);
         }
    }
}
