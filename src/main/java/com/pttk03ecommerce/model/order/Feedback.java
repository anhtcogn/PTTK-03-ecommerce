package com.pttk03ecommerce.model.order;

public class Feedback {
    private int ID, rank;
    private String content;
    private int orderID, userID;

    public Feedback(int ID, int rank, String content, int orderID, int userID) {
        this.ID = ID;
        this.rank = rank;
        this.content = content;
        this.orderID = orderID;
        this.userID = userID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
}
