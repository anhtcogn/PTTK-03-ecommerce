package com.pttk03ecommerce.model.item;

public class Category {
    private Integer ID;
    private String category;

    public Category(Integer ID, String category) {
        this.ID = ID;
        this.category = category;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
