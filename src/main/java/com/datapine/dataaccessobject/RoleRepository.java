package com.datapine.dataaccessobject;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datapine.domainobject.RoleDO;

public interface RoleRepository extends JpaRepository<RoleDO, Long>{
}
