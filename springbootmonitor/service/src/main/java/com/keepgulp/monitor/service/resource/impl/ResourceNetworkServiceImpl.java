package com.keepgulp.monitor.service.resource.impl;

import com.keepgulp.monitor.common.framework.base.paging.SearchMap;
import com.keepgulp.monitor.entity.resource.ResourceNetworkEntity;
import com.keepgulp.monitor.service.resource.ResourceNetworkService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ResourceNetworkServiceImpl implements ResourceNetworkService {
    @Override
    public Page<ResourceNetworkEntity> findAll(SearchMap searchMap, Pageable pageable) {
        return null;
    }
}
