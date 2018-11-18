package com.keepgulp.monitor.service.resource;

import com.keepgulp.monitor.common.framework.base.paging.SearchMap;
import com.keepgulp.monitor.entity.resource.ResourceServerEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


/**
 */
public interface ResourceServerService {

    /**
     * 批量更新ping
     * @param map
     */
    void updatePing(SearchMap map);
    /**
     * 查询所有
     *
     */
    Page<ResourceServerEntity> findAll(SearchMap searchMap, Pageable pageable);

    /**
     * 查询宿主机
     *
     * @return
     */
    List<ResourceServerEntity> findHosts(SearchMap searchMap);

    /**
     * 查询总数
     *
     * @return
     */
    int countResourceTotle();

    /**
     * 获取关机的数量
     * @return
     */
    int countResourceIsOff();

    /**
     * 查询最大ID
     */
    ResourceServerEntity selectMaxId();

    /**
     * 获取服务器的ID
     * @return
     */
    ResourceServerEntity selectServerid(SearchMap map);

    /**
     * 通用
     *
     * @param searchMap
     * @param sqlId
     *
     * @return
     */
    List<ResourceServerEntity> getDataList(SearchMap searchMap, String sqlId);

    /**
     *
     */
    Page<ResourceServerEntity> selectVmSomeHost(SearchMap searchMap, Pageable pageable);
}