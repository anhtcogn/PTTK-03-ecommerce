package com.pttk03ecommerce.model.order;

import com.pttk03ecommerce.model.item.Book;

public class Cart {
    private Integer ID;
    private Integer amount;
    private Book book;

    public Cart(Integer ID, Integer amount, Book book) {
        this.ID = ID;
        this.amount = amount;
        this.book = book;
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

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
