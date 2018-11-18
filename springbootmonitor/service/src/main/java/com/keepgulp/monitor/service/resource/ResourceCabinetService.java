package com.keepgulp.monitor.service.resource;

import com.keepgulp.monitor.common.framework.base.paging.PagingResult;
import com.keepgulp.monitor.common.framework.base.paging.SearchMap;
import com.keepgulp.monitor.entity.resource.ResourceCabinetEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


/**
 */
public interface ResourceCabinetService {

    /**
     * 查询所有
     *
     * @return
     */
    Page<ResourceCabinetEntity> findAll(SearchMap searchMap, Pageable pageable);

}