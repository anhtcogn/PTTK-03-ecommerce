package com.pttk03ecommerce.model.order;

import com.pttk03ecommerce.model.user.User;

public class Feedback {
    private Integer ID;
    private Integer rank;
    private String content;
    private Order order;
    private User user;

    public Feedback(Integer ID, Integer rank, String content, Order order, User user) {
        this.ID = ID;
        this.rank = rank;
        this.content = content;
        this.order = order;
        this.user = user;
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

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
