package com.pttk03ecommerce.model.order;

public class Cart {
    private int ID, amount;
    private int bookID;

    public Cart(int ID, int amount, int bookID) {
        this.ID = ID;
        this.amount = amount;
        this.bookID = bookID;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
