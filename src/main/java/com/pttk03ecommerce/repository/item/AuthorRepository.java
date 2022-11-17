package com.pttk03ecommerce.repository.item;

import com.pttk03ecommerce.model.item.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {
    Author findAuthorByName(String name);
}
