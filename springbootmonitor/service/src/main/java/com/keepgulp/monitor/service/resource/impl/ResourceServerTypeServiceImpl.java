package com.keepgulp.monitor.service.resource.impl;

import com.keepgulp.monitor.common.framework.base.paging.SearchMap;
import com.keepgulp.monitor.entity.resource.ResourceServerTypeEntity;
import com.keepgulp.monitor.service.resource.ResourceServerTypeService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ResourceServerTypeServiceImpl implements ResourceServerTypeService {
    @Override
    public Page<ResourceServerTypeEntity> findAll(SearchMap searchMap, Pageable pageable) {
        return null;
    }
}
