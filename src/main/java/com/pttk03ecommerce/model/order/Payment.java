package com.pttk03ecommerce.model.order;

import java.util.Date;

public class Payment {
    private int ID;
    private Date date;
    private float totalPrice;
    private String status, notes;
    private int orderID;

    public Payment(int ID, Date date, float totalPrice, String status, String notes, int orderID) {
        this.ID = ID;
        this.date = date;
        this.totalPrice = totalPrice;
        this.status = status;
        this.notes = notes;
        this.orderID = orderID;
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

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }
}
