package com.pttk03ecommerce.repository.user;

import com.pttk03ecommerce.model.user.Acount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AcountRepository extends JpaRepository <Acount, Integer>{
    Acount findAcountByUserName(String username);
}
