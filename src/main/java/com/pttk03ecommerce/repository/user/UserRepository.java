package com.pttk03ecommerce.repository.user;

import com.pttk03ecommerce.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface UserRepository extends JpaRepository<User, Integer> {
    public User addUser();

    public User updateUser();

    public User deleteUser();
}
