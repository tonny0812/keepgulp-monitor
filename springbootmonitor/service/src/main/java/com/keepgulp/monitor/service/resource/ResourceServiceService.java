package com.keepgulp.monitor.service.resource;

import com.keepgulp.monitor.common.framework.base.paging.SearchMap;
import com.keepgulp.monitor.entity.resource.ResourceServiceEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


/**
 */

public interface ResourceServiceService {

    /**
     * 查询所有
     */
    Page<ResourceServiceEntity> findAll(SearchMap searchMap, Pageable pageable);
}