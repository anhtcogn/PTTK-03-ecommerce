package com.pttk03ecommerce.model.item;

public class Category {
    private int ID;
    private  String category;
    private  int bookID;

    public Category(int ID, String category, int bookID) {
        this.ID = ID;
        this.category = category;
        this.bookID = bookID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }
}
