package com.pttk03ecommerce.service.impl.user;

import com.pttk03ecommerce.model.user.Account;
import com.pttk03ecommerce.model.user.Address;
import com.pttk03ecommerce.model.user.Fullname;
import com.pttk03ecommerce.model.user.User;
import com.pttk03ecommerce.repository.user.AccountRepository;
import com.pttk03ecommerce.repository.user.AddressRepository;
import com.pttk03ecommerce.repository.user.FullnameRepository;
import com.pttk03ecommerce.repository.user.UserRepository;
import com.pttk03ecommerce.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private FullnameRepository fullnameRepository;
    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public List<User> getUser() {
        List<User> users=(List<User>) userRepository.findAll();
        return users;
    }

    @Override
    public User addUser(User user, String accountUsername, Address address, Fullname fullname) {
        User user1 = new User();
        user1.setGender(user.getGender());
        user1.setEmail(user.getEmail());
        user1.setPhone(user.getPhone());
        user1.setPosition(user.getPosition());
        user1.setDateOfBirth(user.getDateOfBirth());

        Integer accountID = accountRepository.findAccountByUserName(accountUsername).getID();
        if (accountID != null) user1.setAcountID(accountID);
        else {
            Account account = new Account();
            account.setUsername(accountUsername);
            accountRepository.save(account);
            user1.setAcountID(account.getID());
        }
        user1.setAddressID(address.getID());
        addressRepository.save(address);
        user1.setFullnameID(fullname.getID());
        fullnameRepository.save(fullname);
        return userRepository.save(user1);
    }

    @Override
    public User updateUser(User user) {
        User user1 = userRepository.getUserById(user.getID());
        user1.setPhone(user.getPhone());
        user1.setEmail(user.getEmail());
        user1.setGender(user.getGender());
        user1.setPosition(user.getPosition());
        user1.setDateOfBirth(user.getDateOfBirth());
        return userRepository.save(user1);
    }

    @Override
    public void deleteUser(Integer userID) {
        userRepository.deleteById(userID);
    }
}
