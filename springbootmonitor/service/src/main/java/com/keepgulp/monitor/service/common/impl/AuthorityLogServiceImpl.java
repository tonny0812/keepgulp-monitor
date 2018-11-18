package com.keepgulp.monitor.service.common.impl;

import com.keepgulp.monitor.common.framework.base.paging.SearchMap;
import com.keepgulp.monitor.entity.common.AuthorityLogEntity;
import com.keepgulp.monitor.service.common.AuthorityLogService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class AuthorityLogServiceImpl implements AuthorityLogService {
    @Override
    public Page<AuthorityLogEntity> findAll(SearchMap searchMap, Pageable pageable) {
        return null;
    }
}
