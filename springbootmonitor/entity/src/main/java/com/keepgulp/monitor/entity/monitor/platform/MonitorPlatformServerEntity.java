package com.keepgulp.monitor.entity.monitor.platform;

import lombok.Data;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

/**
 */
@Entity
@Table(name = "t_monitor_platform_server",
        uniqueConstraints = {@UniqueConstraint(columnNames="ip")})
@Data
public class MonitorPlatformServerEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "platform_id",columnDefinition="int(11) COMMENT '主键'")
    private Integer platformId;

    @Column(name = "ip",columnDefinition="varchar(32) DEFAULT NULL COMMENT 'ip地址'")
    private String ip;

    @Column(name = "hostname",columnDefinition="varchar(100) DEFAULT NULL COMMENT '主机名'")
    private String hostname;

    @Column(name = "show_key",columnDefinition="varchar(2000) DEFAULT NULL")
    private String showKey;

    @LastModifiedDate
    @Column(name = "last_modify_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifyTime;

    private String data1;
    private String data2;
    private String data3;
    private String data4;
    private String data5;

    private String cpu;
    private String loadavg;
    private String iowait;
    // 平台状态
    private String status;
    private String groupsName;
    // agent版本
    private String version;

}
