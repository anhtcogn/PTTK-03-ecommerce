package com.pttk03ecommerce.service.impl.user;

import com.pttk03ecommerce.model.user.Acount;
import com.pttk03ecommerce.model.user.Address;
import com.pttk03ecommerce.model.user.Fullname;
import com.pttk03ecommerce.model.user.User;
import com.pttk03ecommerce.repository.user.AcountRepository;
import com.pttk03ecommerce.repository.user.UserRepository;
import com.pttk03ecommerce.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private AcountRepository acountRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public User addUser(User user, String acountUsername, Address address, Fullname fullname) {
        User user1 = new User();
        user1.setGender(user.getGender());
        user1.setEmail(user.getEmail());
        user1.setPhone(user.getPhone());
        user1.setPosition(user.getPosition());
        user1.setDateOfBirth(user.getDateOfBirth());

        Integer acountID = acountRepository.findAcountByUserName(acountUsername).getID();
        if (acountID != null) user1.setAcountID(acountID);
        else {
            Acount acount=new Acount();
            acount.setUsername(acountUsername);
            acountRepository.save(acount);
        }
        return user1;
    }
}
