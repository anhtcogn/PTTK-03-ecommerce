package com.pttk03ecommerce.model.order;

import com.pttk03ecommerce.model.user.User;

public class Rank {
    private Integer ID;
    private Integer rank;
    private String contents;
    private Order order;
    private User user;

    public Rank(Integer ID, Integer rank, String contents, Order order, User user) {
        this.ID = ID;
        this.rank = rank;
        this.contents = contents;
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

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
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
