package com.pttk03ecommerce.controller;

import com.pttk03ecommerce.model.user.User;
import com.pttk03ecommerce.repository.user.UserRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public abstract class UserController implements UserRepository {
    @PostMapping("/User")
    public User addUser(@RequestBody User user) {
        return null;
    }

    @Override
    public User updateUser() {
        return null;
    }

    @Override
    public User deleteUser() {
        return null;
    }
}
