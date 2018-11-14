package com.keepgulp.monitor.entity.monitor.monitor;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;


/**
 */
@Entity
@Table(name = "t_monitor_messages",
        uniqueConstraints = {@UniqueConstraint(columnNames="messages_time")})
@Data
public class MonitorMessagesEntity{

    // 开始时间
    private Date start;

    // 结束时间
    private Date end;

    // 每小时统计数
    private int cnt;

    // 时间的每小时
    private  String hours;

    // 监控脚本名称
    private String  monitorName;

    // 组名
    private String groups;

    // 状态
    private  String status;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "messages_id",columnDefinition="int(11) COMMENT '主键'")
    private Integer messagesId;

    @Column(name = "messages_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date messagesTime;

    @Column(name = "messages",columnDefinition="varchar(300) DEFAULT NULL COMMENT '报警消息'")
    private String messages;

    @Column(name = "server_id",columnDefinition="int(11) DEFAULT NULL COMMENT '参考,服务器ID'")
    private Integer serverId;

    @Column(name = "scripts_id",columnDefinition="int(11) DEFAULT NULL COMMENT '参考scripts_id'")
    private Integer scriptsId;

    @Column(name = "groups_id",columnDefinition="int(11) DEFAULT NULL COMMENT '参考业务组的ID'")
    private Integer groupsId;

    @Column(name = "severity_id",columnDefinition="int(11) DEFAULT NULL COMMENT '报警状态，参考serverity_id'")
    private Integer severityId;

    @Column(name = "email",columnDefinition="varchar(32) DEFAULT NULL COMMENT '邮件地址'")
    private String email;

    @Column(name = "mobile",columnDefinition="varchar(32) DEFAULT NULL COMMENT '手机地址'")
    private String mobile;

    @Column(name = "ding",columnDefinition="varchar(32) DEFAULT NULL COMMENT '钉钉地址'")
    private String ding;

    @Column(name = "weixin",columnDefinition="varchar(32) DEFAULT NULL COMMENT '微信地址'")
    private String weixin;

    @Column(name = "alarm_count",columnDefinition="int(11) DEFAULT NULL COMMENT '报警次数'")
    private Integer alarmCount;
}
