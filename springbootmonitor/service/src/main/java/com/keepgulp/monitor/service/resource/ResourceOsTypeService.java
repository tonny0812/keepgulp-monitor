package com.keepgulp.monitor.service.resource;

import com.keepgulp.monitor.common.framework.base.paging.SearchMap;
import com.keepgulp.monitor.entity.resource.ResourceOsTypeEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


/**
 */
public interface ResourceOsTypeService {

    /**
     * 查询所有
     */
    Page<ResourceOsTypeEntity> findAll(SearchMap searchMap, Pageable pageable);
}