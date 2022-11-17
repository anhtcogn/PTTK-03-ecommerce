package com.pttk03ecommerce.model.user;

import java.time.LocalDateTime;
import java.util.Date;

public class User {
    private Integer ID;
    private LocalDateTime dateOfBirth;
    private String phone;
    private String email;
    private String gender;
    private String position;
    private Acount acount;
    private Address address;
    private Fullname fullname;

    public User(Integer ID, LocalDateTime dateOfBirth, String phone, String email, String gender, String position, Acount acount, Address address, Fullname fullname) {
        this.ID = ID;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.email = email;
        this.gender = gender;
        this.position = position;
        this.acount = acount;
        this.address = address;
        this.fullname = fullname;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDateTime dateOfBirth) {
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

    public Acount getAcount() {
        return acount;
    }

    public void setAcount(Acount acount) {
        this.acount = acount;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Fullname getFullname() {
        return fullname;
    }

    public void setFullname(Fullname fullname) {
        this.fullname = fullname;
    }
}
