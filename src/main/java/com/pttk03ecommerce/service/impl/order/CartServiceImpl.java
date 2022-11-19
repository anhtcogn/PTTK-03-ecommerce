package com.pttk03ecommerce.service.impl.order;

import com.pttk03ecommerce.model.item.Book;
import com.pttk03ecommerce.model.order.CartBook;
import com.pttk03ecommerce.model.user.User;
import com.pttk03ecommerce.repository.item.BookRepository;
import com.pttk03ecommerce.repository.order.CartBookRepository;
import com.pttk03ecommerce.repository.user.UserRepository;
import com.pttk03ecommerce.service.order.CartService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CartServiceImpl implements CartService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    BookRepository bookRepository;
    @Autowired
    CartBookRepository cartBookRepository;
    @Override
    public List<User> getUser() {
        return userRepository.findAll();
    }

    @Override
    public List<Book> getBook(Integer cartID, CartBook cartBooks) {
        return null;
    }
}
