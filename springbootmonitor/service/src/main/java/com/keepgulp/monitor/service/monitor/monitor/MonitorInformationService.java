package com.keepgulp.monitor.service.monitor.monitor;

import com.keepgulp.monitor.common.framework.base.paging.SearchMap;
import com.keepgulp.monitor.entity.monitor.monitor.MonitorInformationEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface MonitorInformationService {

     Page<MonitorInformationEntity> findAll(SearchMap searchMap, Pageable pageable);

    /**
     * 统计状态
     * @return
     */
    List<MonitorInformationEntity> selectAlarmCount(SearchMap map);

    /**
     * 统计各监控命令数量
     * @param map
     * @return
     */
    List<MonitorInformationEntity> selectCheckCommandCount(SearchMap map);

    /**
     * 获取每个组的指定
     * @param map
     * @return
     */
    List<MonitorInformationEntity> selectGroupsMonitorInfo(SearchMap map,String sqlId);
}
