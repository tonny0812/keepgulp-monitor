package com.keepgulp.monitor.service.resource;

import com.keepgulp.monitor.common.framework.base.paging.SearchMap;
import com.keepgulp.monitor.entity.resource.ResourceNetworkEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


/**
 */
public interface ResourceNetworkService {

    Page<ResourceNetworkEntity> findAll(SearchMap searchMap, Pageable pageable);


}