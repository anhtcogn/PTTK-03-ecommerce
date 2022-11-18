package com.pttk03ecommerce.controller.user;

import com.pttk03ecommerce.model.user.Account;
import com.pttk03ecommerce.repository.user.AccountRepository;
import com.pttk03ecommerce.service.user.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/account")
public abstract class AccountController implements AccountRepository {
    @Autowired
    AccountService accountService;

    @GetMapping("/account")
    public List<Account> getAccount(Integer accountID){
        return accountService.getAccount(accountID);
    }
    @PostMapping("/account")
    public Account addAccount(@RequestBody Account account){
        return accountService.addAccount(account);
    }
}
