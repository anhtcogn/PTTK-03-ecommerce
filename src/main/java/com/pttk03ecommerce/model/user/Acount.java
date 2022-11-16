package com.pttk03ecommerce.model.user;

public class Acount {
    private int ID;
    private String username, password, status;
    private int userID;

    public Acount(int ID, String username, String password, String status, int userID) {
        this.ID = ID;
        this.username = username;
        this.password = password;
        this.status = status;
        this.userID = userID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
}
