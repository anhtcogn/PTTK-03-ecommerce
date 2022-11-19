package com.pttk03ecommerce.repository.order;

import com.pttk03ecommerce.model.order.CartBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartBookRepository extends JpaRepository<CartBook,Integer> {
}
