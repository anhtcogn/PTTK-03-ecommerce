package com.pttk03ecommerce.service.order;

import com.pttk03ecommerce.model.item.Book;
import com.pttk03ecommerce.model.order.CartBook;
import com.pttk03ecommerce.model.user.User;

import java.util.List;

public interface CartService {
    List<User> getUser();

    List<Book> getBook(Integer cartID, CartBook cartBooks);
}
