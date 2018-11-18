package com.keepgulp.monitor.service.resource;

import com.keepgulp.monitor.common.framework.base.paging.SearchMap;
import com.keepgulp.monitor.entity.resource.ResourceInventoryEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


/**
 */
public interface ResourceInventoryService {

    /**
     */
    Page<ResourceInventoryEntity> findAll(SearchMap searchMap, Pageable pageable);
}