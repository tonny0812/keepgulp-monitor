package com.keepgulp.monitor.service.resource;

import com.keepgulp.monitor.common.framework.base.paging.SearchMap;
import com.keepgulp.monitor.entity.resource.ResourceFloorEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


/**
 */
public interface ResourceFloorService {

    /**
     * 查询所有
     */
    Page<ResourceFloorEntity> findAll(SearchMap searchMap, Pageable pageable);

}