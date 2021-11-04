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
public class CategoryDAO extends MyDAO{
    public ArrayList<Category> getCategory() {
    ArrayList<Category> t = new ArrayList<>();
    xSql = "select * from category";
    
    try {
      ps = con.prepareStatement(xSql);
      rs = ps.executeQuery();
      while(rs.next()) {
         Category c= new Category();
         c.setCid(rs.getInt("cid"));
         c.setCname(rs.getString("cname"));
       t.add(c);
      }
      rs.close();
      ps.close();
     }
     catch(Exception e) {
        e.printStackTrace();
     }
    return(t);
  }
}
