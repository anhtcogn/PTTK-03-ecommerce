package com.pttk03ecommerce.model.item;

public class Publisher {
    private int ID;
    private String name, address, email, status;
    private int bookID;

    public Publisher(int ID, String name, String address, String email, String status, int bookID) {
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.email = email;
        this.status = status;
        this.bookID = bookID;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }
}
