package com.pttk03ecommerce.model.order;

import java.time.LocalDateTime;
import java.util.Date;

public class Payment {
    private Integer ID;
    private LocalDateTime date;
    private Float totalPrice;
    private String status;
    private String notes;
    private Integer orderID;

    public Payment(Integer ID, LocalDateTime date, Float totalPrice, String status, String notes, Integer orderID) {
        this.ID = ID;
        this.date = date;
        this.totalPrice = totalPrice;
        this.status = status;
        this.notes = notes;
        this.orderID = orderID;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public LocalDateTime getLocalDateTime() {
        return date;
    }

    public void setLocalDateTime(LocalDateTime date) {
        this.date = date;
    }

    public Float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Float totalPrice) {
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

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }
}
