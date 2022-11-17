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
}
