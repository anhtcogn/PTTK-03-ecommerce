package com.pttk03ecommerce.model.order;

public class Shipment {
    private Integer ID;
    private String status;
    private String notes;
    private Integer orderID;

    public Shipment(Integer ID, String status, String notes, Integer orderID) {
        this.ID = ID;
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
