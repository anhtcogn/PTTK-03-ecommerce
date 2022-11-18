package com.pttk03ecommerce.service.impl.item;

import com.pttk03ecommerce.model.item.Author;
import com.pttk03ecommerce.model.item.Book;
import com.pttk03ecommerce.model.item.Category;
import com.pttk03ecommerce.model.item.Publisher;
import com.pttk03ecommerce.repository.item.AuthorRepository;
import com.pttk03ecommerce.repository.item.BookRepository;
import com.pttk03ecommerce.repository.item.CategoryRepository;
import com.pttk03ecommerce.repository.item.PublisherRepository;
import com.pttk03ecommerce.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private PublisherRepository publisherRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    @Override
    public List<Book> getAllByAuthorId(Integer id) {
        return bookRepository.getAllByAuthorId(id);
    }

    @Override
    public List<Book> getAllByCategoryId(Integer id) {
        return bookRepository.getAllByCategoryId(id);
    }

    @Override
    public List<Book> getAllByPublisherId(Integer id) {
        return bookRepository.getAllByPublisherId(id);
    }

    @Override
    public Book updateBook(Book book, String authorName, String publisherName, String categoryName) {
        Book book1;
        if (book.getId() != null) {
            book1 = bookRepository.getBookById(book.getId());
            book1.setId(book.getId());
        }
        else {
            book1 = new Book();
        }

        book1.setName(book.getName());
        book1.setPrice(book.getPrice());
        book1.setSale(book.getSale());
        book1.setDescribe(book.getDescribe());
        book1.setStatus(book.getStatus());

        Integer authorId = authorRepository.findAuthorByName(authorName).getID();
        if (authorId != null) book1.setAuthorId(authorId);
        else {
            Author author = new Author();
            author.setName(authorName);
            authorRepository.save(author);
            book1.setAuthorId(author.getID());
        }

        Integer publisherId = publisherRepository.findByName(publisherName).getID();
        if (publisherId != null) book1.setPublisherId(publisherId);
        else {
            Publisher publisher = new Publisher();
            publisher.setName(publisherName);
            publisherRepository.save(publisher);
            book1.setPublisherId(publisher.getID());
        }

        Integer categoryId = categoryRepository.findByName(categoryName).getID();
        if (categoryId != null) book1.setCategoryId(categoryId);
        else {
            Category category = new Category();
            category.setName(categoryName);
            categoryRepository.save(category);
            book1.setCategoryId(category.getID());
        }
        return bookRepository.save(book1);
    }

    @Override
    public void deleteBook(Integer bookId) {
        Book book = bookRepository.getBookById(bookId);
        bookRepository.delete(book);
    }
}
