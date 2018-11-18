package com.keepgulp.monitor.entity.monitor.report;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 */
@Entity
@Table(name = "t_monitor_report_day",
        uniqueConstraints = {@UniqueConstraint(columnNames="start_time")})
@Data
public class MonitorReportDayEntity {

    private String ipAddress;
    private String groupsName;
    private String cnt;
    private String month;

    // 画饼图使用
    private String name;
    private int y;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "platform_id",columnDefinition="int(11) COMMENT '主键'")
    private Integer reportId;

    @Column(name = "server_id",columnDefinition="bigint(20) DEFAULT NULL COMMENT ''")
    private Long serverId;

    @Column(name = "operator",columnDefinition="varchar(100) DEFAULT NULL COMMENT '故障处理人'")
    private String operator;

    @Column(name = "alarm_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date alarmTime;

    @Column(name = "scripts_id",columnDefinition="int(11) DEFAULT NULL COMMENT '脚本ID，参考脚本ID'")
    private Integer scriptsId;

    @Column(name = "severity_id",columnDefinition="int(11) DEFAULT NULL COMMENT '报警级别,参考severity_id'")
    private Integer severityId;

    @Column(name = "operator_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date operatorTime;

    @Column(name = "groups_id",columnDefinition="int(11) DEFAULT NULL COMMENT '组ID'")
    private Integer groupsId;

    @Column(name = "index_name",columnDefinition="varchar(132) DEFAULT NULL")
    private String indexName;

    // 处理进度
    @Column(name = "change_status",columnDefinition="varchar(32) DEFAULT NULL COMMENT '修改状态'")
    private String changeStatus;

    @Column(name = "start_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;
}
