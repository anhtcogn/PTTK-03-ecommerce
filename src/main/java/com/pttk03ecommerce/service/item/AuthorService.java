package com.pttk03ecommerce.service;

import com.pttk03ecommerce.model.item.Author;
import com.pttk03ecommerce.model.item.Publisher;

import java.util.List;

public interface AuthorService {
    List<Author> getAll();
    Author addAuthor(Author author);

    Author updateAuthor(Author author);

    void deleteAuthor(Integer id);
}
