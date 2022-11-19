package com.pttk03ecommerce.model.order;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
@Table(name = "payment")
@NoArgsConstructor
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    private LocalDateTime date;
    private Float totalPrice;
    private String status;
    private String notes;
    @Column(name = "order_id")
    private Integer orderID;
}
