package com.pttk03ecommerce.model.order;

public class Feedback {
    private Integer ID;
    private Integer rank;
    private String content;
    private Integer orderID;
    private Integer userID;

    public Feedback(Integer ID, Integer rank, String content, Integer orderID, Integer userID) {
        this.ID = ID;
        this.rank = rank;
        this.content = content;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
