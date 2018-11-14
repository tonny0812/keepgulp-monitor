package com.keepgulp.monitor.entity.monitor.monitor;

import lombok.Data;

import java.util.Map;

/**
 * Created by admin on 2016/7/23.
 */
@Data
public class CheckCountEntity {

    // 正常的数量
    private int ok;

    // 脚本的名称
    private String name;

    // 未知的数量
    private int unknown;

    // 警告的数量
    private int warning;

    // 危险的数量
    private int danger;

    // 设置管理员
    private String user;

    // 所有的数据
    private Map<String,String> okMap;
    private Map<String,String> faildMap;
    private Map<String,String> unknownMap;
    private Map<String,String> warningMap;

    // 存放主机数量
    private int hostSize;

    // id
    private  int id;

}
