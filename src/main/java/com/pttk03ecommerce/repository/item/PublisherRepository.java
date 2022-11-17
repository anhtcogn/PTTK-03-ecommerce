package com.pttk03ecommerce.repository.item;

import com.pttk03ecommerce.model.item.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Integer> {

    Publisher findByName(String name);

    Publisher getByID(Integer id);
}
