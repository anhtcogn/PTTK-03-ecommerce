package com.pttk03ecommerce.model.order;

public class Shipment {
    private Integer ID;
    private String status;
    private String notes;
    private Order order;

    public Shipment(Integer ID, String status, String notes, Order order) {
        this.ID = ID;
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

    public Order getOrderID() {
        return order;
    }

    public void setOrderID(Integer orderID) {
        this.order = order;
    }
}
