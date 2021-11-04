package model;
import java.sql.*;
import java.util.ArrayList;
public class UserDAO extends MyDAO {

   public User getUser(String xName, String xPass) {
      xSql = "select * from [THINHDEPTRAI].[dbo].[Account] where [user] = ? and [pass] = ?";

      int xRole;
      User x = null;
      try {
        ps = con.prepareStatement(xSql);
        ps.setString(1, xName);
        ps.setString(2, xPass);
        rs = ps.executeQuery();
        /* The cursor on the rs after this statement is in the BOF area, i.e. it is before the first record.
         Thus the first rs.next() statement moves the cursor to the first record
        */

      if(rs.next()) { 
        xRole = rs.getInt("isAdmin");
        x = new User(xName,xPass,xRole);
       }
       else
         x = null; 
       rs.close();
       ps.close();
      }
       catch(Exception e) {
      }
     return(x); 
   } 
   public ArrayList<User> getUser() {
        ArrayList<User> t = new ArrayList<>();
        xSql = "select * from Account order by uid asc";
        int isadmin; int id;
        String name, pass;
        User x;
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                id=rs.getInt("uID");
                name = rs.getString("user");
                pass =rs.getString("pass");
                isadmin=rs.getInt("isAdmin");
                x = new User(id, name, pass, isadmin);
                t.add(x);
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (t);
    }
   public User getUserByName(String xName) {
    if(xName==null || xName.trim().equals("")) return(null);  
     User x = null;
     String xPass; int xRole;
     xSql = "select * from Account where [user]=?";
     try {
       ps = con.prepareStatement(xSql);
       ps.setString(1,xName);
       rs = ps.executeQuery();
        /* The cursor on the rs after this statement is in the BOF area, i.e. it is before the first record.
         Thus the first rs.next() statement moves the cursor to the first record
        */
       if(rs.next()) {
          xPass = rs.getString("pass");
          xRole = rs.getInt("isadmin");
          x = new User(xName,xPass,xRole);
        } 
        rs.close();
        ps.close();
       }
       catch(Exception e) {
        e.printStackTrace();
      }
     return(x); 
   } 

  public void insert(User x) {
     xSql = "insert into Account values (?,?,?)"; 
     try {
      ps = con.prepareStatement(xSql);
      ps.setString(1, x.getName());
      ps.setString(2, x.getPass());
      ps.setInt(3, x.getRole());
      ps.executeUpdate();
      ps.close();
     }     
     catch(Exception e) {
        e.printStackTrace();
     }
  }

  public void updateByName(User x) {
     xSql = "update Account set pass=?, isadmin=? where [user]=?";
     try {      
        ps = con.prepareStatement(xSql);
        ps.setString(1, x.getPass());
        ps.setInt(2, x.getRole());
        ps.setString(3, x.getName());
        ps.executeUpdate();
        ps.close();
     }
      catch(Exception e) {
        e.printStackTrace();
      }
     return;
  }

  public void deleteByName(String xName) {
     xSql = "delete from Account where [user]=?";
     try {
        ps = con.prepareStatement(xSql);
        ps.setString(1, xName);
        ps.executeUpdate();
        ps.close();
     }
     catch(Exception e) {
        e.printStackTrace();
     }
  }
   
    public static void main(String[] args) {
        UserDAO ud= new UserDAO();
        User u= ud.getUserByName("hello");
            System.out.println(u);
        }
        
    
     

}
