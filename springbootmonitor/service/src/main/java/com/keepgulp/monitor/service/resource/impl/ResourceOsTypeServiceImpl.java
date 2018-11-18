package com.keepgulp.monitor.service.resource.impl;

import com.keepgulp.monitor.common.framework.base.paging.SearchMap;
import com.keepgulp.monitor.entity.resource.ResourceOsTypeEntity;
import com.keepgulp.monitor.service.resource.ResourceOsTypeService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ResourceOsTypeServiceImpl implements ResourceOsTypeService {
    @Override
    public Page<ResourceOsTypeEntity> findAll(SearchMap searchMap, Pageable pageable) {
        return null;
    }
}
