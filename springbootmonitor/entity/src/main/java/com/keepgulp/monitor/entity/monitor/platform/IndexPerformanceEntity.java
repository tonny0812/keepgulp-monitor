package com.keepgulp.monitor.entity.monitor.platform;

import lombok.Data;

/**
 */
@Data
public class IndexPerformanceEntity {

    private String key;
    private Double value;
    private String groupsName;
    private String ip;
    private String hostname;
    private Long lastModifyTime;
}
