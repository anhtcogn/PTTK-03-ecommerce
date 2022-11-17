package com.pttk03ecommerce.model.order;

import java.time.LocalDateTime;
import java.util.Date;

public class Payment {
    private Integer ID;
    private LocalDateTime date;
    private Float totalPrice;
    private String status;
    private String notes;
    private Order order;

    public Payment(Integer ID, LocalDateTime date, Float totalPrice, String status, String notes, Order order) {
        this.ID = ID;
        this.date = date;
        this.totalPrice = totalPrice;
        this.status = status;
        this.notes = notes;
        this.order = order;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
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

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
