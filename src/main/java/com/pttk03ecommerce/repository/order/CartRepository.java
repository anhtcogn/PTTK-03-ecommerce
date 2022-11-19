package com.pttk03ecommerce.repository.order;

import com.pttk03ecommerce.model.order.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Integer> {
}
