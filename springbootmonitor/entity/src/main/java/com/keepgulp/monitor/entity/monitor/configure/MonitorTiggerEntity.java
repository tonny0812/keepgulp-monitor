package com.keepgulp.monitor.entity.monitor.configure;

import lombok.Data;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

/**
 */
@Entity
@Table(name = "t_monitor_tigger")
@Data
public class MonitorTiggerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "group_id",columnDefinition="int(11) COMMENT '主键'")
    private Integer tiggerId;

    @Column(name = "tigger_name",columnDefinition="varchar(300) DEFAULT NULL COMMENT '触发器名字'")
    private String tiggerName;

    @Column(name = "expression",columnDefinition="varchar(1000) DEFAULT NULL COMMENT '表达式,监控项  > == < memory.totle > 100 '")
    private String expression;

    @Column(name = "is_valid",columnDefinition="BOOLEAN DEFAULT TRUE COMMENT '是否有效'")
    private Boolean isValid;

    @LastModifiedDate
    @Column(name = "last_modify_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifyTime;

    @Column(name = "last_modify_user",columnDefinition="varchar(32) DEFAULT NULL COMMENT '最近修改用户'")
    private String lastModifyUser;

    @Column(name = "severity_id",columnDefinition="int(11) DEFAULT NULL COMMENT '参考报警级别ID'")
    private Integer severityId;

    @Column(name = "template_id",columnDefinition="int(11) DEFAULT NULL COMMENT '所属模板ID，参考template_id'")
    private Integer templateId;

}
