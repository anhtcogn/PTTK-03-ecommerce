package com.pttk03ecommerce.model.order;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "cart")
@NoArgsConstructor
public class Shipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    private String status;
    private String notes;
    @Column(name = "order_id")
    private Integer orderID;
}
