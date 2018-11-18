package com.keepgulp.monitor.service.resource;

import com.keepgulp.monitor.common.framework.base.paging.SearchMap;
import com.keepgulp.monitor.entity.resource.ResourceUserEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


/**
 */

public interface ResourceUserService {

    /**
     * 查询所有
     */
    Page<ResourceUserEntity> findAll(SearchMap searchMap, Pageable pageable);
}