package com.pttk03ecommerce.model.item;

public class Author {
    private int ID;
    private String name, describe;
    private int bookID;

    public Author(int ID, String name, String describe, int bookID) {
        this.ID = ID;
        this.name = name;
        this.describe = describe;
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

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }
}
