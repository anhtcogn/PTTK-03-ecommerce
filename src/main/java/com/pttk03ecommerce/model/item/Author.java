package com.pttk03ecommerce.model.item;

public class Author {
    private Integer ID;
    private String name;
    private String describe;
    private Integer bookID;

    public Author(Integer ID, String name, String describe, Integer bookID) {
        this.ID = ID;
        this.name = name;
        this.describe = describe;
        this.bookID = bookID;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
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

    public Integer getBookID() {
        return bookID;
    }

    public void setBookID(Integer bookID) {
        this.bookID = bookID;
    }
}
