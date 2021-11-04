package model;

public class User {

    private int id;
    private String name;
    private String pass;
    private int role;

    public User() {
    }

    public User(String name, String pass, int role) {
        this.name = name;
        this.pass = pass;
        this.role = role;
    }

    public User(int id, String name, String pass, int role) {
        this.id = id;
        this.name = name;
        this.pass = pass;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    public void setName(String name) {
        this.name = name;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setRole(int role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ", pass=" + pass + ", role=" + role + '}';
    }

   
    

    public String getName() {
        return name;
    }

    public String getPass() {
        return pass;
    }

    public int getRole() {
        return role;
    }

}
