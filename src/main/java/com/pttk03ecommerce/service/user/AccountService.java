package com.pttk03ecommerce.service.user;

import com.pttk03ecommerce.model.user.Account;

import java.util.List;

public interface AccountService {
    Account addAccount(Account account);
    List<Account> getAccount(Integer accountID);
}
