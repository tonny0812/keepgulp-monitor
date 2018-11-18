package com.keepgulp.monitor.entity.monitor.configure;

import lombok.Data;

/**
 */
@Data
public class SysinfoDataEntity {
    // 数据名称
    private String name;
    // 标签组
    private String lable;
    // 数据结果
    private Object result;
}
