package com.keepgulp.monitor.service.resource.impl;

import com.keepgulp.monitor.common.framework.base.paging.SearchMap;
import com.keepgulp.monitor.entity.resource.ResourceGroupsEntity;
import com.keepgulp.monitor.service.resource.ResourceGroupsService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ResourceGroupsServiceImpl implements ResourceGroupsService {
    @Override
    public Page<ResourceGroupsEntity> findAll(SearchMap searchMap, Pageable pageable) {
        return null;
    }
}
