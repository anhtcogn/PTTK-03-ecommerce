package com.pttk03ecommerce.service.item;

import com.pttk03ecommerce.model.item.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorService  {
    Author addAuthor(Author author);

    Author updateAuthor(Author author);

    void deleteAuthor(Integer id);
}
