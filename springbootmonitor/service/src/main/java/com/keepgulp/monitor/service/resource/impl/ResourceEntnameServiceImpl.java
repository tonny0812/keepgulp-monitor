package com.keepgulp.monitor.service.resource.impl;

import com.keepgulp.monitor.common.framework.base.paging.SearchMap;
import com.keepgulp.monitor.entity.resource.ResourceEntnameEntity;
import com.keepgulp.monitor.service.resource.ResourceEntnameService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ResourceEntnameServiceImpl implements ResourceEntnameService {
    @Override
    public Page<ResourceEntnameEntity> findAll(SearchMap searchMap, Pageable pageBounds) {
        return null;
    }
}
