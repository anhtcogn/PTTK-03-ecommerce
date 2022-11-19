package com.pttk03ecommerce.model.order;

import com.pttk03ecommerce.model.user.User;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "rank")
@NoArgsConstructor
public class Rank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    private Integer rank;
    private String contents;
    @Column(name = "order_id")
    private Integer orderID;
    @Column(name = "user_id")
    private Integer userID;
}
