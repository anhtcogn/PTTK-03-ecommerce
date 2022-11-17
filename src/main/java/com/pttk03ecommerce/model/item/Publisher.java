package com.pttk03ecommerce.model.item;

import lombok.Data;

import javax.persistence.*;

@Data
@Table
@Entity
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private String name;
    private String address;
    private String email;
    private String status;

}
