package com.keepgulp.monitor.entity.monitor.configure;

import lombok.Data;

/**
 * 报警暂停使用功能
 * Created by zhaoyun on 2017/5/25.
 */
@Data
public class MonitorPauseEntity {

    // 机房名称
    private String floorName;

    private String hostId;
    private String serverId;
    private String ipAddress;
    private String hostIpAddress;


    // 创建时间
    private long createTime;
    // 用户ID
    private String userId;
    private String userName;
    // 脚本ID
    private String scriptsId;
    // 环境ID
    private String entId;
    private String entName;
    // 报警暂停时间
    private String pauseTime;
    // 某个机房报警
    private String floorId;
    // 创建时间
    // 创建人
    private String createUser;
    // 关闭时间
    private String closeTime;
    // 脚本名称
    private String scriptName;
    private String groupsId;
    private String groupsName;

    // 机柜
    private String cabinetId;
    private String cabinetName;

}
