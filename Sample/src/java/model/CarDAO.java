package model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CarDAO extends MyDAO {

    public ArrayList<Car> getCar() {
        ArrayList<Car> t = new ArrayList<>();
        xSql = "select * from car order by id asc";
        int id;
        String name, image;
        String title, description;
        int price, cateid;
        Car x;
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                id = rs.getInt("id");
                name = rs.getString("name");
                image = rs.getString("image");
                price = rs.getInt("price");
                title = rs.getString("title");
                description = rs.getString("description");
                cateid = rs.getInt("cateId");
                x = new Car(id, name, image, price, title, description, cateid);
                t.add(x);
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (t);
    }

    public ArrayList<Car> getCarByCate(String cid) {
        ArrayList<Car> t = new ArrayList<>();
        xSql = "select * from car where cateid=? ";
        int id;
        String name, image;
        String title, description;
        int price, cateid;
        Car x;
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, cid);
            rs = ps.executeQuery();
            while (rs.next()) {
                id = rs.getInt("id");
                name = rs.getString("name");
                image = rs.getString("image");
                price = rs.getInt("price");
                title = rs.getString("title");
                description = rs.getString("description");
                cateid = rs.getInt("cateId");
                x = new Car(id, name, image, price, title, description, cateid);
                t.add(x);
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (t);
    }
    public ArrayList<Car> getCarByPriceH() {
        ArrayList<Car> t = new ArrayList<>();
        xSql = "select * from car order by price desc ";
        int id;
        String name, image;
        String title, description;
        int price, cateid;
        Car x;
        try {
            ps = con.prepareStatement(xSql);
            
            rs = ps.executeQuery();
            while (rs.next()) {
                id = rs.getInt("id");
                name = rs.getString("name");
                image = rs.getString("image");
                price = rs.getInt("price");
                title = rs.getString("title");
                description = rs.getString("description");
                cateid = rs.getInt("cateId");
                x = new Car(id, name, image, price, title, description, cateid);
                t.add(x);
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (t);
    }
    public ArrayList<Car> getCarByPriceL() {
        ArrayList<Car> t = new ArrayList<>();
        xSql = "select * from car order by price asc ";
        int id;
        String name, image;
        String title, description;
        int price, cateid;
        Car x;
        try {
            ps = con.prepareStatement(xSql);
            
            rs = ps.executeQuery();
            while (rs.next()) {
                id = rs.getInt("id");
                name = rs.getString("name");
                image = rs.getString("image");
                price = rs.getInt("price");
                title = rs.getString("title");
                description = rs.getString("description");
                cateid = rs.getInt("cateId");
                x = new Car(id, name, image, price, title, description, cateid);
                t.add(x);
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (t);
    }

    public ArrayList<Car> getCarByName(String xname) {
        ArrayList<Car> t = new ArrayList<>();
        xSql = "select * from car where name like ? ";
        int id;
        String name, image;
        String title, description;
        int price, cateid;
        Car x;
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, "%" + xname + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                id = rs.getInt("id");
                name = rs.getString("name");
                image = rs.getString("image");
                price = rs.getInt("price");
                title = rs.getString("title");
                description = rs.getString("description");
                cateid = rs.getInt("cateId");
                x = new Car(id, name, image, price, title, description, cateid);
                t.add(x);
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (t);
    }
    public Car CheckCar(String xname) {
        
        xSql = "select * from car where name = ? ";
        int id;
        String name, image;
        String title, description;
        int price, cateid;
        Car x=null;
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1,xname);
            rs = ps.executeQuery();
            while (rs.next()) {
                id = rs.getInt("id");
                name = rs.getString("name");
                image = rs.getString("image");
                price = rs.getInt("price");
                title = rs.getString("title");
                description = rs.getString("description");
                cateid = rs.getInt("cateId");
                x = new Car(id, name, image, price, title, description, cateid);
                
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (x);
    }

    public Car getCarById(String xid) {

        xSql = "select * from car where id = ? ";
        int id;
        String name, image;
        String title, description;
        int price, cateid;
        Car x = null;
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, xid);
            rs = ps.executeQuery();
            if (rs.next()) {
                id = rs.getInt("id");
                name = rs.getString("name");
                image = rs.getString("image");
                price = rs.getInt("price");
                title = rs.getString("title");
                description = rs.getString("description");
                cateid = rs.getInt("cateId");
                x = new Car(id, name, image, price, title, description, cateid);

            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (x);
    }

    public void insertCar(Car x) {
        xSql = "insert into Car values (?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, x.getName());
            ps.setString(2, x.getImage());
            ps.setInt(3, x.getPrice());
            ps.setString(4, x.getTitle());
            ps.setString(5, x.getDescription());
            ps.setInt(6, x.getCateid());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(String xid) {
        xSql = "delete from Car where id=?";
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, xid);
            ps.executeUpdate();
            //con.commit();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(String xid, Car x) {
        xSql = "update Car set name=?, image=?,price=?,title=?,description=?,cateid=? where id=?";
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, x.getName());
            ps.setString(2, x.getImage());
            ps.setInt(3, x.getPrice());
            ps.setString(4, x.getTitle());
            ps.setString(5, x.getDescription());
            ps.setInt(6, x.getCateid());
            ps.setString(7, xid);
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return;
    }

    public static void main(String[] args) {
        CarDAO c = new CarDAO();
        

    }

}
