package com.pttk03ecommerce.model.item;

import com.pttk03ecommerce.model.order.Cart;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "book")
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    private String name;
    private String describe;
    private Float price;
    private Float sale;
    private String status;

    @Column(name = "cart_id")
    private Integer cartId;

    @Column(name = "author_id")
    private Integer authorId;

    @Column(name = "publisher_id")
    private Integer publisherId;

    @Column(name = "category_id")
    private Integer categoryId;
}