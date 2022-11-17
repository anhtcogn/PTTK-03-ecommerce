package com.pttk03ecommerce.repository.user;

import com.pttk03ecommerce.model.user.Acount;

public interface AcountRepository {
    Acount findAcountByUserName(String username);
}
