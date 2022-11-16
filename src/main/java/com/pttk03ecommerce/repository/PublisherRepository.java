package com.pttk03ecommerce.repository;

import com.pttk03ecommerce.model.item.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepository extends JpaRepository<Integer, Publisher> {
}
