package com.keepgulp.monitor.service.resource.impl;

import com.keepgulp.monitor.common.framework.base.paging.SearchMap;
import com.keepgulp.monitor.entity.resource.ResourceInventoryEntity;
import com.keepgulp.monitor.service.resource.ResourceInventoryService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ResourceInventoryServiceImpl implements ResourceInventoryService {
    @Override
    public Page<ResourceInventoryEntity> findAll(SearchMap searchMap, Pageable pageable) {
        return null;
    }
}
