package com.pttk03ecommerce.model.item;

import lombok.Data;

import javax.persistence.*;

@Data
@Table
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    private String name;
}
