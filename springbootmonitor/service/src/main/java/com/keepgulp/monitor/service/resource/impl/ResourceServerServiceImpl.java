package com.keepgulp.monitor.service.resource.impl;

import com.keepgulp.monitor.common.framework.base.paging.SearchMap;
import com.keepgulp.monitor.entity.resource.ResourceServerEntity;
import com.keepgulp.monitor.service.resource.ResourceServerService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceServerServiceImpl implements ResourceServerService {
    @Override
    public void updatePing(SearchMap map) {

    }

    @Override
    public Page<ResourceServerEntity> findAll(SearchMap searchMap, Pageable pageable) {
        return null;
    }

    @Override
    public List<ResourceServerEntity> findHosts(SearchMap searchMap) {
        return null;
    }

    @Override
    public int countResourceTotle() {
        return 0;
    }

    @Override
    public int countResourceIsOff() {
        return 0;
    }

    @Override
    public ResourceServerEntity selectMaxId() {
        return null;
    }

    @Override
    public ResourceServerEntity selectServerid(SearchMap map) {
        return null;
    }

    @Override
    public List<ResourceServerEntity> getDataList(SearchMap searchMap, String sqlId) {
        return null;
    }

    @Override
    public Page<ResourceServerEntity> selectVmSomeHost(SearchMap searchMap, Pageable pageable) {
        return null;
    }
}
