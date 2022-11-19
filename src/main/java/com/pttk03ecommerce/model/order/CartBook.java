package com.pttk03ecommerce.model.order;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "cart_book")
@NoArgsConstructor
public class CartBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "cart_id")
    private Integer cartID;
    @Column(name = "book_id")
    private Integer bookID;
}
