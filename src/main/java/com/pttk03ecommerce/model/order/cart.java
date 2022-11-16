package com.pttk03ecommerce.model.order;

public class cart {
    private int ID, amount;

    public cart(int ID, int amount) {
        this.ID = ID;
        this.amount = amount;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
