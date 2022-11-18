package com.pttk03ecommerce.service.impl.item;

import com.pttk03ecommerce.model.item.Author;
import com.pttk03ecommerce.repository.item.AuthorRepository;
import com.pttk03ecommerce.service.item.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public List<Author> getAll() {
        return authorRepository.findAll();
    }

    @Override
    public Author addAuthor(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public Author updateAuthor(Author author) {
        Author author1 = authorRepository.getByID(author.getID());
        author1.setName(author.getName());
        author1.setDescribe(author.getDescribe());
        return authorRepository.save(author1);
    }

    @Override
    public void deleteAuthor(Integer id) {
        authorRepository.deleteById(id);
    }
}
