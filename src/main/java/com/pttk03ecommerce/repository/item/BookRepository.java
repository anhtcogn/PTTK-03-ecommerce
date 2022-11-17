package com.pttk03ecommerce.repository.item;

import com.pttk03ecommerce.model.item.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
   Book getBookById(Integer id);
}
