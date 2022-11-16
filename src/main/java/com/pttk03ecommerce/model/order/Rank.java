package com.pttk03ecommerce.model.order;

public class Rank {
    private Integer ID;
    private Integer rank;
    private String contents;
    private Integer orderID;
    private Integer userID;

    public Rank(Integer ID, Integer rank, String contents, Integer orderID, Integer userID) {
        this.ID = ID;
        this.rank = rank;
        this.contents = contents;
        this.orderID = orderID;
        this.userID = userID;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }
}
