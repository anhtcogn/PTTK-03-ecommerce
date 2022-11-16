package com.pttk03ecommerce.model.item;

public class Book {
    private Integer ID;
    private String name, describe;
    private Float price;
    private Float sale;
    private String status;
    private Integer cartID;

    public Book(Integer ID, String name, String describe, Float price, Float sale, String status, Integer cartID) {
        this.ID = ID;
        this.name = name;
        this.describe = describe;
        this.price = price;
        this.sale = sale;
        this.status = status;
        this.cartID = cartID;
    }

    public Integer getCartID() {
        return cartID;
    }

    public void setCartID(Integer cartID) {
        this.cartID = cartID;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getSale() {
        return sale;
    }

    public void setSale(Float sale) {
        this.sale = sale;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
