package com.pttk03ecommerce.service.impl;

import com.pttk03ecommerce.model.item.Book;
import com.pttk03ecommerce.repository.BookRepository;
import com.pttk03ecommerce.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book updateBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public void deleteBook(Integer bookId) {
        Book book = bookRepository.getBookById(bookId);
        bookRepository.delete(book);
    }
}
