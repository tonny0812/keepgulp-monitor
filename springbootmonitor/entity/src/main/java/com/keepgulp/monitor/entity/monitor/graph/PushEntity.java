package com.keepgulp.monitor.entity.monitor.graph;

import lombok.Data;

/**
 * 画图数据实体
 **/
@Data
public class PushEntity {

    private String memory;
    private String cpu;
    private String disk;
    private String sn;
    private String os;

    /**
     * 客户端ip
     */
    private String ip;

    /**
     * 图像名
     */
    private String name;

    /**
     * 图像组
     */
    private String groups;

    /**
     * 图像值
     **/
    private String value;

    /**
     * 消息日志
     */
    private String messages;

    /**
     * 报警状态1,2,3,4
     */
    private String status;

    /**
     * 脚本名称
     */
    private String command;

    /**
     * 处理时间
     */
    private String time;

    /**
     * 业务线
     */
    private String groupsName;

    /**
     * 配置文件ID
     */
    private String configId;

    /**
     * 处理服务器
     */
    private String server;

    /**
     * 设置脚本id
     * @return
     */
    private String scriptId;

    /**
     * 服务器ID
     * @return
     */
    private String serverId;

}