package com.pttk03ecommerce.service.impl.user;

import com.pttk03ecommerce.model.user.Fullname;
import com.pttk03ecommerce.repository.user.FullnameRepository;
import com.pttk03ecommerce.service.user.FullnameService;
import org.springframework.beans.factory.annotation.Autowired;

public class FullnameServiceImpl implements FullnameService {
    @Autowired
    FullnameRepository fullnameRepository;

    @Override
    public Fullname updateFullname(Fullname fullname) {
        Fullname fullname1 = fullnameRepository.getFullnameById(fullname.getID());
        fullname1.setFirstName(fullname.getFirstName());
        fullname1.setLastName(fullname.getLastName());
        return fullnameRepository.save(fullname1);
    }
}
