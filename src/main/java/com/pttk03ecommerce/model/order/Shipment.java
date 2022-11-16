package com.pttk03ecommerce.model.order;

public class Shipment {
    private int ID;
    private String status, notes;
    private int orderID;

    public Shipment(int ID, String status, String notes, int orderID) {
        this.ID = ID;
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
