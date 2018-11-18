package com.keepgulp.monitor.repository.common;

import com.keepgulp.monitor.entity.common.AuthorityUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityUserRepository extends JpaRepository<AuthorityUserEntity,Integer>, JpaSpecificationExecutor<AuthorityUserEntity> {
}
