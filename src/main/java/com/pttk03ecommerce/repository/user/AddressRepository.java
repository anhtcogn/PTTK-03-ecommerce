package com.pttk03ecommerce.repository.user;

import com.pttk03ecommerce.model.user.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}
