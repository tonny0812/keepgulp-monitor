package com.keepgulp.monitor.service.resource;

import com.keepgulp.monitor.common.framework.base.paging.SearchMap;
import com.keepgulp.monitor.entity.resource.ResourceEntnameEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


/**
 */
public interface ResourceEntnameService{

    /**
     * 查询所有
     */
    Page<ResourceEntnameEntity> findAll(SearchMap searchMap, Pageable pageBounds);
}