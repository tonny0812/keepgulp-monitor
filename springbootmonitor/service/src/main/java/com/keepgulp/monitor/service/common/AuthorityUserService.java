package com.keepgulp.monitor.service.common;

import com.keepgulp.monitor.common.framework.base.paging.SearchMap;
import com.keepgulp.monitor.entity.common.AuthorityUserEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


/**
 */
public interface AuthorityUserService {

    Page<AuthorityUserEntity> findAll(SearchMap searchMap, Pageable pageable);

    void delete(AuthorityUserEntity entity);

    void update(AuthorityUserEntity entity);

    void save(AuthorityUserEntity entity);
}