package com.keepgulp.monitor.service.resource;

import com.keepgulp.monitor.common.framework.base.paging.SearchMap;
import com.keepgulp.monitor.entity.resource.ResourceGroupsEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


/**
 */
public interface ResourceGroupsService {

    /**
     * 查询所有
     */
    Page<ResourceGroupsEntity> findAll(SearchMap searchMap, Pageable pageable);
}