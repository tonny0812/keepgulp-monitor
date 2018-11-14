package com.keepgulp.monitor.entity.resource;

import lombok.Data;

/**
 * Created by zhaoyun on 2017/11/22.
 * @author zhaoyun
 */
@Data
public class TopEntity {
    private int key;
    private int parent;
    private String port;
    private String ip;
    private String color;
    private String typename;
    private String entname;
    private String username;
    private String cabinet;
    private String switchIp;
    private String domainName;
}
