package com.pttk03ecommerce.service;

import com.pttk03ecommerce.model.item.Book;

public interface BookService {

    Book addBook(Book book);

    Book updateBook(Book book);

    void deleteBook(Integer bookId);
}
