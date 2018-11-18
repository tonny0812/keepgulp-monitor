package com.keepgulp.monitor.service.common;

import com.keepgulp.monitor.common.framework.base.paging.SearchMap;
import com.keepgulp.monitor.entity.common.AuthorityLogEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


/**
 */
public interface AuthorityLogService {

    Page<AuthorityLogEntity> findAll(SearchMap searchMap, Pageable pageable);
}