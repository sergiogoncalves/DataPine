package com.datapine.dataaccessobject;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datapine.domainobject.UserDO;

public interface UserRepository extends JpaRepository<UserDO, Long> {
    UserDO findByUsername(String username);
}
