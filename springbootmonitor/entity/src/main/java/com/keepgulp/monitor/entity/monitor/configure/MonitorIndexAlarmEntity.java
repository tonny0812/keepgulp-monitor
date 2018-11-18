package com.keepgulp.monitor.entity.monitor.configure;


import lombok.Data;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

/**
 */
@Entity
@Table(name = "t_monitor_index_alarm",
        uniqueConstraints = {@UniqueConstraint(columnNames={"server_id","index_id"})})
@Data
public class MonitorIndexAlarmEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "alarm_id",columnDefinition="int(11) COMMENT '主键'")
    private Integer alarmId;

    @Column(name = "index_id",columnDefinition="int(11) DEFAULT NULL COMMENT '参考指标表id'")
    private Integer indexId;

    @Column(name = "server_id",columnDefinition="int(11) DEFAULT NULL COMMENT '参考server_id'")
    private Integer serverId;

    @Column(name = "gt_value",columnDefinition="varchar(30) DEFAULT NULL")
    private String gtValue;

    @Column(name = "lt_value",columnDefinition="varchar(30) DEFAULT NULL")
    private String ltValue;

    @Column(name = "eq_value",columnDefinition="varchar(30) DEFAULT NULL")
    private String eqValue;

    @LastModifiedDate
    @Column(name = "last_modify_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifyTime;

    @Column(name = "last_modify_user",columnDefinition="varchar(32) DEFAULT NULL COMMENT '最近修改用户'")
    private String lastModifyUser;

    @Column(name = "status_id",columnDefinition="int(11) DEFAULT NULL COMMENT '条件达成后报警级别'")
    private Integer statusId;

    @Column(name = "weixin_groups",columnDefinition="varchar(1000) DEFAULT NULL COMMENT '微信组'")
    private String weixinGroups;

    @Column(name = "ding_groups",columnDefinition="varchar(1000) DEFAULT NULL")
    private String dingGroups;

    @Column(name = "mobile_groups",columnDefinition="varchar(1000) DEFAULT NULL")
    private String mobileGroups;

    @Column(name = "email_groups",columnDefinition="varchar(1000) DEFAULT NULL")
    private String emailGroups;

    @Column(name = "is_mobile",columnDefinition="BOOLEAN DEFAULT NULL COMMENT '是否有效'")
    private Boolean isMobile;

    @Column(name = "is_email",columnDefinition="BOOLEAN DEFAULT NULL COMMENT '是否有效'")
    private Boolean isEmail;

    @Column(name = "is_ding",columnDefinition="BOOLEAN DEFAULT NULL COMMENT '是否有效'")
    private Boolean isDing;

    @Column(name = "is_weixin",columnDefinition="BOOLEAN DEFAULT NULL COMMENT '是否有效'")
    private Boolean isWeixin;

    @Column(name = "is_alarm",columnDefinition="BOOLEAN DEFAULT NULL COMMENT '是否有效'")
    private Boolean isAlarm;

    @Column(name = "not_eq_value",columnDefinition="varchar(30) DEFAULT NULL")
    private String notEqValue;

    @Column(name = "all_groups",columnDefinition="varchar(1000) DEFAULT NULL COMMENT '所有报警组'")
    private String  allGroups;

    @Column(name = "alarm_count",columnDefinition="varchar(3) DEFAULT NULL COMMENT '报警次数'")
    private String alarmCount;

    @Column(name = "alarm_interval",columnDefinition="varchar(3) DEFAULT NULL COMMENT '报警间隔'")
    private String alarmInterval;

    private String indexName;
    private String ipAddress;
    private boolean sendAlarm;
    private String sendMessages;
    private boolean isConfigure;
}
