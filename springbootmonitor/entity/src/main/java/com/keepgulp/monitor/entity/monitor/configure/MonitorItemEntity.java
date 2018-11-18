package com.keepgulp.monitor.entity.monitor.configure;

import lombok.Data;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

/**
 */
@Entity
@Table(name = "t_monitor_item")
@Data
public class MonitorItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "group_id",columnDefinition="int(11) COMMENT '主键'")
    private Integer itemId;

    @Column(name = "item_name",columnDefinition="varchar(200) NOT NULL COMMENT ''")
    private String itemName;

    @Column(name = "description",columnDefinition="varchar(200) NOT NULL COMMENT ''")
    private String description;

    @Column(name = "monitor_time",columnDefinition="varchar(25) DEFAULT '7x24' COMMENT ''")
    private String monitorTime;

    @Column(name = "check_interval",columnDefinition="int(11) DEFAULT '5' COMMENT ''")
    private Integer checkInterval;

    @Column(name = "alarm_count",columnDefinition="int(11) DEFAULT '3' COMMENT ''")
    private Integer alarmCount;

    @Column(name = "alarm_interval",columnDefinition="int(11) DEFAULT '15' COMMENT ''")
    private Integer alarmInterval;

    @Column(name = "script_id",columnDefinition="int(11) NOT NULL COMMENT ''")
    private Integer scriptId;

    @Column(name = "arg1",columnDefinition="varchar(2000) DEFAULT NULL COMMENT ''")
    private String arg1;

    @Column(name = "arg2",columnDefinition="varchar(2000) DEFAULT NULL COMMENT ''")
    private String arg2;

    @Column(name = "arg3",columnDefinition="varchar(2000) DEFAULT NULL COMMENT ''")
    private String arg3;

    @Column(name = "arg4",columnDefinition="varchar(2000) DEFAULT NULL COMMENT ''")
    private String arg4;

    @Column(name = "arg5",columnDefinition="varchar(2000) DEFAULT NULL COMMENT ''")
    private String arg5;

    @Column(name = "arg6",columnDefinition="varchar(2000) DEFAULT NULL COMMENT ''")
    private String arg6;

    @Column(name = "arg7",columnDefinition="varchar(2000) DEFAULT NULL COMMENT ''")
    private String arg7;

    @Column(name = "arg8",columnDefinition="varchar(2000) DEFAULT NULL COMMENT ''")
    private String arg8;

    @Column(name = "is_valid",columnDefinition="BOOLEAN DEFAULT NULL COMMENT '是否有效'")
    private Boolean isValid;

    @LastModifiedDate
    @Column(name = "last_modify_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifyTime;

    @Column(name = "last_modify_user",columnDefinition="varchar(32) DEFAULT NULL COMMENT '最近修改用户'")
    private String lastModifyUser;

    @Column(name = "template_id",columnDefinition="varchar(1000) DEFAULT NULL COMMENT '使用模板,可以使用多个用逗号分隔'")
    private String templateId;

    @Column(name = "retry",columnDefinition="int(11) DEFAULT '5' COMMENT ''")
    private Integer retry;

    @Column(name = "is_recover",columnDefinition="BOOLEAN DEFAULT TRUE COMMENT '是否恢复'")
    private Boolean isRecover;

    @Column(name = "alarm_messages",columnDefinition="varchar(800) DEFAULT NULL COMMENT '报警信息'")
    private String alarmMessages;

    @Column(name = "recover_messages",columnDefinition="varchar(800) DEFAULT NULL COMMENT '恢复信息'")
    private String recoverMessages;

    @Column(name = "resend",columnDefinition="int(11) DEFAULT '24' COMMENT '重新发送时间'")
    private Integer resend;

    // 是否发送合并后报警短信
    @Column(name = "is_merge",columnDefinition="BOOLEAN DEFAULT NULL COMMENT '是否合并报警信息'")
    private Boolean isMerge;

    @Column(name = "is_admin",columnDefinition="BOOLEAN DEFAULT NULL COMMENT '是否是管理员组,所有报警都发送到管理员组'")
    private Boolean isAdmin;

    @Column(name = "is_default",columnDefinition="BOOLEAN DEFAULT NULL COMMENT '开启后agent将自动监控该项目'")
    private Boolean isDefault;

}
