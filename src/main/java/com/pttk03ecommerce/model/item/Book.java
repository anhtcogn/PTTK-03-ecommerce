package com.pttk03ecommerce.model.item;

public class Book {
    private int ID;
    private String name, describe;
    private float price;
    private float sale;
    private String status;
    private int cartID;

    public Book(int ID, String name, String describe, float price, float sale, String status, int cartID) {
        this.ID = ID;
        this.name = name;
        this.describe = describe;
        this.price = price;
        this.sale = sale;
        this.status = status;
        this.cartID = cartID;
    }

    public int getCartID() {
        return cartID;
    }

    public void setCartID(int cartID) {
        this.cartID = cartID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getSale() {
        return sale;
    }

    public void setSale(float sale) {
        this.sale = sale;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
