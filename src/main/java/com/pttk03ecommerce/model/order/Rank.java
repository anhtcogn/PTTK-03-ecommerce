package com.pttk03ecommerce.model.order;

public class Rank {
    private int ID, rank;
    private String contents;
    private int orderID, userID;

    public Rank(int ID, int rank, String contents, int orderID, int userID) {
        this.ID = ID;
        this.rank = rank;
        this.contents = contents;
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

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
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
