package com.pttk03ecommerce.model.order;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "order")
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    private Date date;
    private Float price;
    private String status;
    @Column(name = "cart_id")
    private Integer cartID;
}
