package com.pttk03ecommerce.model.order;

import com.pttk03ecommerce.model.item.Book;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "cart")
@NoArgsConstructor
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    private Integer amount;
    @Column(name = "book_id")
    private Integer bookId;
    @Column(name = "user_id")
    private Integer userID;
}
