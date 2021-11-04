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
public class Car {
    int ID; String name,image;
    String title,description;
    int price, cateid;

    public Car(int ID, String name, String image,int price, String title, String description, int cateid) {
        this.ID = ID;
        this.name = name;
        this.image = image;
        this.title = title;
        this.description = description;
        this.price = price;
        this.cateid = cateid;
    }

    public Car(String name, String image,int price, String title, String description,  int cateid) {
        this.name = name;
        this.image = image;
        this.title = title;
        this.description = description;
        this.price = price;
        this.cateid = cateid;
    }
    
    public Car() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String descrption) {
        this.description = descrption;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCateid() {
        return cateid;
    }

    public void setCateid(int cateid) {
        this.cateid = cateid;
    }

    @Override
    public String toString() {
        return "Car{" + "ID=" + ID + ", name=" + name + ", image=" + image + ", title=" + title + ", description=" + description + ", price=" + price + ", cateid=" + cateid + '}';
    }
    
}
