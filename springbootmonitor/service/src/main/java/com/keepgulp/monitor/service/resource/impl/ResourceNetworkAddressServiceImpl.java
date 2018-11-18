package com.keepgulp.monitor.service.resource.impl;

import com.keepgulp.monitor.common.framework.base.paging.SearchMap;
import com.keepgulp.monitor.entity.resource.ResourceNetworkAddressEntity;
import com.keepgulp.monitor.service.resource.ResourceNetworkAddressService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ResourceNetworkAddressServiceImpl implements ResourceNetworkAddressService {
    @Override
    public Page<ResourceNetworkAddressEntity> findAll(SearchMap searchMap, Pageable pageable) {
        return null;
    }
}
