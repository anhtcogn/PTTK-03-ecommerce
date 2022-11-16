package com.pttk03ecommerce.model.user;

public class Fullname {
    private int ID;
    private String firstName, lastName;
    private int userID;

    public Fullname(int ID, String firstName, String lastName, int userID) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userID = userID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
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

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
}
