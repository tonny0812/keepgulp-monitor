package com.keepgulp.monitor.service.resource.impl;

import com.keepgulp.monitor.common.framework.base.paging.SearchMap;
import com.keepgulp.monitor.entity.resource.ResourceFloorEntity;
import com.keepgulp.monitor.service.resource.ResourceFloorService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ResourceFloorServiceImpl implements ResourceFloorService {
    @Override
    public Page<ResourceFloorEntity> findAll(SearchMap searchMap, Pageable pageable) {
        return null;
    }
}
