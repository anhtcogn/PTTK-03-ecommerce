package com.pttk03ecommerce.model.order;

import java.util.Date;

public class Order {
    private int ID;
    private Date date;
    private float price;
    private String status;
    private int cartID;

    public Order(int ID, Date date, float price, String status, int cartID) {
        this.ID = ID;
        this.date = date;
        this.price = price;
        this.status = status;
        this.cartID = cartID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCartID() {
        return cartID;
    }

    public void setCartID(int cartID) {
        this.cartID = cartID;
    }
}
