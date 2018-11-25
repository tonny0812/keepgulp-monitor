package com.keepgulp.monitor.service.monitor.monitor;

import com.keepgulp.monitor.common.framework.base.paging.SearchMap;
import com.keepgulp.monitor.entity.monitor.monitor.MonitorMessagesEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface MonitorMessagesService {

    Page<MonitorMessagesEntity> findAll(SearchMap searchMap, Pageable pageable);


}
