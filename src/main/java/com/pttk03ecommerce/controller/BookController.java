package com.pttk03ecommerce.controller;

import com.pttk03ecommerce.model.item.Book;
import com.pttk03ecommerce.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping()
    public Book addBook(@RequestBody Book book,
                        @RequestParam String authorName,
                        @RequestParam String publisherName,
                        @RequestParam String categoryName) {
        return bookService.addBook(book, authorName, publisherName, categoryName);
    }

}
