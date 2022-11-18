package com.pttk03ecommerce.service;

import com.pttk03ecommerce.model.item.Book;

import java.util.List;

public interface BookService {

    List<Book> getAll();
    List<Book> getAllByAuthorId(Integer id);
    List<Book> getAllByCategoryId(Integer id);
    List<Book> getAllByPublisherId(Integer id);

    Book updateBook(Book book, String authorName, String publisherName, String categoryName);

    void deleteBook(Integer bookId);
}
