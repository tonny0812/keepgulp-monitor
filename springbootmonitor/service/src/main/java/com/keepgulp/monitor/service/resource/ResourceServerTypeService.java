package com.keepgulp.monitor.service.resource;

import com.keepgulp.monitor.common.framework.base.paging.SearchMap;
import com.keepgulp.monitor.entity.resource.ResourceServerTypeEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


/**
 */

public interface ResourceServerTypeService{

    /**
     * 查询所有
     */
    Page<ResourceServerTypeEntity> findAll(SearchMap searchMap, Pageable pageable);
}