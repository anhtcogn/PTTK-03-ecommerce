package com.pttk03ecommerce.service.item;

import com.pttk03ecommerce.model.item.Book;

public interface BookService {

    Book addBook(Book book, String authorName, String publisherName, String categoryName);

    Book updateBook(Book book);

    void deleteBook(Integer bookId);
}
