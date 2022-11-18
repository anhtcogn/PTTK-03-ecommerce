package com.pttk03ecommerce.controller.user;

import com.pttk03ecommerce.model.user.Address;
import com.pttk03ecommerce.model.user.Fullname;
import com.pttk03ecommerce.model.user.User;
import com.pttk03ecommerce.repository.user.UserRepository;
import com.pttk03ecommerce.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/User")
public abstract class UserController implements UserRepository {
    @Autowired
    UserService userService;

    @GetMapping("/User")
    public List<User> getUser(){
        return userService.getUser();
    }

    @PostMapping("/User")
    public User addUser(@RequestBody User user, @RequestParam String accountUsername, @RequestBody Address address, @RequestBody Fullname fullname) {
        return userService.addUser(user, accountUsername, address, fullname);
    }

    @PutMapping("/User")
    public User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @DeleteMapping("/User/{id}")
    public void deleteUser(@RequestParam("id") Integer userID) {
        userService.deleteUser(userID);
    }
}
