package com.datapine.service.user;

import com.datapine.domainobject.UserDO;

public interface UserService {
    void save(UserDO user);

    UserDO findByUsername(String username);
}
