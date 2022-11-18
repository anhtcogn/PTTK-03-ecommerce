package com.pttk03ecommerce.controller.item;

import com.pttk03ecommerce.model.item.Author;
import com.pttk03ecommerce.service.item.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/author")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping
    public List<Author> getAll() {
        return authorService.getAll();
    }
    @PostMapping
    public Author addAuthor(@RequestBody Author author) {
        return authorService.addAuthor(author);
    }
    @PutMapping
    public Author updateAuthor(@RequestBody Author author) {
        return authorService.updateAuthor(author);
    }

    @DeleteMapping
    public void deleteAuthor(@RequestParam Integer authorId) {
        authorService.deleteAuthor(authorId);
    }
}
