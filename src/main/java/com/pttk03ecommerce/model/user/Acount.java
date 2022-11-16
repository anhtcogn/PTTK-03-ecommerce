package com.pttk03ecommerce.model.user;

public class Acount {
    private Integer ID;
    private String username;
    private String password;
    private String status;
    private Integer userID;

    public Acount(Integer ID, String username, String password, String status, Integer userID) {
        this.ID = ID;
        this.username = username;
        this.password = password;
        this.status = status;
        this.userID = userID;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
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

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }
}
