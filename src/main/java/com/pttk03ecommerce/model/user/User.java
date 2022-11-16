package com.pttk03ecommerce.model.user;

import java.util.Date;

public class User {
    private int ID;
    private Date dateOfBirth;
    private String phone, email, gender, position;

    public User(int ID, Date dateOfBirth, String phone, String email, String gender, String position) {
        this.ID = ID;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.email = email;
        this.gender = gender;
        this.position = position;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Date getDateofBirth() {
        return dateOfBirth;
    }

    public void dateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
