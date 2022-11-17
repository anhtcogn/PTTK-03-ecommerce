package com.pttk03ecommerce.model.order;

import java.util.Date;

public class Order {
    private Integer ID;
    private Date date;
    private Float price;
    private String status;
    private Cart cart;

    public Order(Integer ID, Date date, Float price, String status, Cart cart) {
        this.ID = ID;
        this.date = date;
        this.price = price;
        this.status = status;
        this.cart = cart;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
