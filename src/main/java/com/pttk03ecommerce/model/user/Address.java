package com.pttk03ecommerce.model.user;

public class Address {
    private int ID, number;
    private String streetName, districtName, provinceName;
    private int userID;

    public Address(int ID, int number, String streetName, String districtName, String provinceName, int userID) {
        this.ID = ID;
        this.number = number;
        this.streetName = streetName;
        this.districtName = districtName;
        this.provinceName = provinceName;
        this.userID = userID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
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

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
}
