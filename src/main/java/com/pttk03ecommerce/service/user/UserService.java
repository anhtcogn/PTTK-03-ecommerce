package com.pttk03ecommerce.service.user;

import com.pttk03ecommerce.model.user.Address;
import com.pttk03ecommerce.model.user.Fullname;
import com.pttk03ecommerce.model.user.User;

import java.util.List;

public interface UserService {
    List<User> getUser();
    User addUser(User user, String acountUsername, Address address, Fullname fullname);
    User updateUser(User user);
    void deleteUser(Integer userID);
}
