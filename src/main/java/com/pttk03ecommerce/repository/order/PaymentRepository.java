package com.pttk03ecommerce.repository.order;

import com.pttk03ecommerce.model.order.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
