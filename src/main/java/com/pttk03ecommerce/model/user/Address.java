package com.pttk03ecommerce.model.user;

public class Address {
    private Integer ID;
    private Integer number;
    private String streetName;
    private String districtName;
    private String provinceName;
    private Integer userID;

    public Address(Integer ID, Integer number, String streetName, String districtName, String provinceName, Integer userID) {
        this.ID = ID;
        this.number = number;
        this.streetName = streetName;
        this.districtName = districtName;
        this.provinceName = provinceName;
        this.userID = userID;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }
}
