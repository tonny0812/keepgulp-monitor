package com.keepgulp.monitor.service.resource.impl;

import com.keepgulp.monitor.common.framework.base.paging.SearchMap;
import com.keepgulp.monitor.entity.resource.ResourceUserEntity;
import com.keepgulp.monitor.service.resource.ResourceUserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ResourceUserServiceImpl implements ResourceUserService {
    @Override
    public Page<ResourceUserEntity> findAll(SearchMap searchMap, Pageable pageable) {
        return null;
    }
}
