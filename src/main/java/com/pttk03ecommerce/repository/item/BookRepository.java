package com.pttk03ecommerce.repository.item;

import com.pttk03ecommerce.model.item.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
   List<Book> getAllByAuthorId(Integer id);
   List<Book> getAllByCategoryId(Integer id);
   List<Book> getAllByPublisherId(Integer id);
   Book getBookById(Integer id);
}
