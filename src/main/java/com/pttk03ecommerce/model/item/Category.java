package com.pttk03ecommerce.model.item;

public class Category {
    private Integer ID;
    private  String category;
    private  Integer bookID;

    public Category(Integer ID, String category, Integer bookID) {
        this.ID = ID;
        this.category = category;
        this.bookID = bookID;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getBookID() {
        return bookID;
    }

    public void setBookID(Integer bookID) {
        this.bookID = bookID;
    }
}
