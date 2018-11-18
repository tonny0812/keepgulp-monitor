package com.keepgulp.monitor.entity.monitor.configure;

import lombok.Data;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

/**
 */

@Entity
@Table(name = "t_monitor_severity")
@Data
public class MonitorSeverityEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "severity_id",columnDefinition="int(11) COMMENT '主键'")
    private Integer severityId;

    @Column(name = "severity_name",columnDefinition="varchar(100) DEFAULT NULL COMMENT '级别名称'")
    private String severityName;

    @LastModifiedDate
    @Column(name = "last_modify_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifyTime;

    @Column(name = "last_modify_user",columnDefinition="varchar(32) DEFAULT NULL COMMENT '最近修改用户'")
    private String lastModifyUser;

}
