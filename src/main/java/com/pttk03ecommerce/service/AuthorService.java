package com.pttk03ecommerce.service;

import com.pttk03ecommerce.model.item.Author;

public interface AuthorService {
    Author addAuthor(Author author);

    Author updateAuthor(Author author);

    void deleteAuthor(Integer id);
}
