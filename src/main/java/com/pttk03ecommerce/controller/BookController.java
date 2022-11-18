package com.pttk03ecommerce.controller;

import com.pttk03ecommerce.model.item.Book;
import com.pttk03ecommerce.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/book")
public class BookController {

    @Autowired
    private BookService bookService;
    @GetMapping("/getAll")
    public List<Book> getAll() {
        return bookService.getAll();
    }

    @GetMapping("/getByAuthor")
    public List<Book> getAllByAuthorId(Integer id) {
        return bookService.getAllByAuthorId(id);
    }

    @GetMapping("/getByCategory")
    public List<Book> getAllByCategoryId(Integer id) {
        return bookService.getAllByCategoryId(id);
    }

    @GetMapping("/getByPublisher")
    public List<Book> getAllByPublisherId(Integer id) {
        return bookService.getAllByPublisherId(id);
    }
    @PostMapping()
    public Book addBook(@RequestBody Book book,
                        @RequestParam String authorName,
                        @RequestParam String publisherName,
                        @RequestParam String categoryName) {
        return bookService.updateBook(book, authorName, publisherName, categoryName);
    }

    @PutMapping
    public Book updateBook(@RequestBody Book book,
                        @RequestParam String authorName,
                        @RequestParam String publisherName,
                        @RequestParam String categoryName) {
        return bookService.updateBook(book, authorName, publisherName, categoryName);
    }

    @DeleteMapping
    public void deleteBook(@RequestParam Integer bookId) {
        bookService.deleteBook(bookId);
    }
}
