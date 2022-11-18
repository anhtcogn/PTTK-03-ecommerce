package com.pttk03ecommerce.repository.user;

import com.pttk03ecommerce.model.user.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository extends JpaRepository <Account, Integer>{
    Account findAccountByUserName(String username);

    List<Account> findAllById(Integer accountID);
}
