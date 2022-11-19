package com.pttk03ecommerce.repository.order;

import com.pttk03ecommerce.model.order.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
