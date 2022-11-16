package com.pttk03ecommerce.model.user;

public class Fullname {
    private Integer ID;
    private String firstName;
    private String lastName;
    private Integer userID;

    public Fullname(Integer ID, String firstName, String lastName, Integer userID) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userID = userID;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }
}
