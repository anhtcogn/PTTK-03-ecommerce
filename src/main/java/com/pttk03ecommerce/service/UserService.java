package com.pttk03ecommerce.service;

import com.pttk03ecommerce.model.user.Address;
import com.pttk03ecommerce.model.user.Fullname;
import com.pttk03ecommerce.model.user.User;

public interface UserService {
    User addUser(User user, String acountUsername, Address address, Fullname fullname);
}
