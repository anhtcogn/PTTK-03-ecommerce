package com.pttk03ecommerce.model.order;

public class Cart {
    private Integer ID;
    private Integer amount;
    private Integer bookID;

    public Cart(Integer ID, Integer amount, Integer bookID) {
        this.ID = ID;
        this.amount = amount;
        this.bookID = bookID;
    }

    public Integer getBookID() {
        return bookID;
    }

    public void setBookID(Integer bookID) {
        this.bookID = bookID;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
