package com.keepgulp.monitor.service.resource.impl;

import com.keepgulp.monitor.common.framework.base.paging.SearchMap;
import com.keepgulp.monitor.entity.resource.ResourceServiceEntity;
import com.keepgulp.monitor.service.resource.ResourceServiceService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ResourceServiceServiceImpl implements ResourceServiceService {
    @Override
    public Page<ResourceServiceEntity> findAll(SearchMap searchMap, Pageable pageable) {
        return null;
    }
}
