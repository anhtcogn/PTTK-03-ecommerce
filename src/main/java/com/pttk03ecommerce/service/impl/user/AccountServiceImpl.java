package com.pttk03ecommerce.service.impl.user;

import com.pttk03ecommerce.model.user.Account;
import com.pttk03ecommerce.repository.user.AccountRepository;
import com.pttk03ecommerce.service.user.AccountService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountRepository accountRepository;

    @Override
    public Account addAccount(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public List<Account> getAccount(Integer accountID) {
        List<Account> accounts = accountRepository.findAllById(accountID);
        return accounts;
    }
}
