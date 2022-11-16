package com.pttk03ecommerce.model.order;

import java.util.Date;

public class Order {
    private Integer ID;
    private Date date;
    private Float price;
    private String status;
    private Integer cartID;

    public Order(Integer ID, Date date, Float price, String status, Integer cartID) {
        this.ID = ID;
        this.date = date;
        this.price = price;
        this.status = status;
        this.cartID = cartID;
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

    public Integer getCartID() {
        return cartID;
    }

    public void setCartID(Integer cartID) {
        this.cartID = cartID;
    }
}
