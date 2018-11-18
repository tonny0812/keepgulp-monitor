package com.keepgulp.monitor.entity.monitor.configure;

import lombok.Data;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

/**
 */
@Entity
@Table(name = "t_monitor_configure")
@Data
public class MonitorConfigureEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "configure_id",columnDefinition="int(11) COMMENT '主键'")
    private Integer configureId;

    @Column(name = "host_id",columnDefinition="int(11) DEFAULT NULL COMMENT '主机,参考资源server_id'")
    private Integer hostId;

    @Column(name = "description",columnDefinition="varchar(200) DEFAULT NULL COMMENT '描述信息'")
    private String description;

    @Column(name = "monitor_time",columnDefinition="varchar(25) DEFAULT '7x24'")
    private String monitorTime;

    @Column(name = "alarm_count",columnDefinition="int(11) DEFAULT NULL COMMENT '报警次数'")
    private Integer alarmCount;

    @Column(name = "alarm_interval",columnDefinition="int(11) DEFAULT NULL COMMENT '报警间隔'")
    private Integer alarmInterval;

    @Column(name = "script_id",columnDefinition="int(11) DEFAULT NULL COMMENT '脚本名，参考脚本id'")
    private Integer scriptId;

    @Column(name = "is_valid",columnDefinition="BOOLEAN DEFAULT TRUE COMMENT '是否有效'")
    private Boolean isValid;

    @LastModifiedDate
    @Column(name = "last_modify_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifyTime;

    @Column(name = "last_modify_user",columnDefinition="varchar(32) DEFAULT NULL COMMENT '最近修改用户'")
    private String lastModifyUser;

    @Column(name = "template_id",columnDefinition="varchar(1000) DEFAULT NULL COMMENT '使用模板,可以使用多个用逗号分隔'")
    private String templateId;

    @Column(name = "groups_id",columnDefinition="varchar(1000) DEFAULT NULL COMMENT '使用组,多个用逗号分隔'")
    private String groupsId;

    private String groupsName;

    @Column(name = "retry",columnDefinition="int(11) DEFAULT NULL COMMENT '失败重试次数'")
    private Integer retry;

    @Column(name = "monitor_configure_tp",columnDefinition="varchar(20) DEFAULT NULL")
    private String monitorConfigureTp;

    @Column(name = "monitor_hosts_tp",columnDefinition="varchar(20) DEFAULT NULL")
    private String monitorHostsTp;

    @Column(name = "hosts",columnDefinition="varchar(2000) DEFAULT NULL COMMENT '监控服务器IP地址，参考server_id'")
    private String hosts;

    @Column(name = "arg1",columnDefinition="varchar(1000) DEFAULT NULL COMMENT '参数1'")
    private String arg1;

    @Column(name = "arg2",columnDefinition="varchar(1000) DEFAULT NULL COMMENT '参数2'")
    private String arg2;

    @Column(name = "arg3",columnDefinition="varchar(1000) DEFAULT NULL COMMENT '参数3'")
    private String arg3;

    @Column(name = "arg4",columnDefinition="varchar(1000) DEFAULT NULL COMMENT '参数4'")
    private String arg4;

    @Column(name = "arg5",columnDefinition="varchar(1000) DEFAULT NULL COMMENT '参数5'")
    private String arg5;

    @Column(name = "arg6",columnDefinition="varchar(1000) DEFAULT NULL COMMENT '参数6'")
    private String arg6;

    @Column(name = "arg7",columnDefinition="varchar(1000) DEFAULT NULL COMMENT '参数7'")
    private String arg7;

    @Column(name = "arg8",columnDefinition="varchar(1000) DEFAULT NULL COMMENT '参数8'")
    private String arg8;

    @Column(name = "check_interval",columnDefinition="int(11) DEFAULT NULL COMMENT '脚本检查间隔'")
    private Integer checkInterval;

    @Column(name = "is_mobile",columnDefinition="BOOLEAN DEFAULT FALSE COMMENT '是否有效'")
    private Boolean isMobile;

    @Column(name = "is_email",columnDefinition="BOOLEAN DEFAULT FALSE COMMENT '是否有效'")
    private Boolean isEmail;

    @Column(name = "is_ding",columnDefinition="BOOLEAN DEFAULT FALSE COMMENT '是否有效'")
    private Boolean isDing;

    @Column(name = "is_weixin",columnDefinition="BOOLEAN DEFAULT FALSE COMMENT '是否有效'")
    private Boolean isWeixin;

    @Column(name = "weixin_groups",columnDefinition="varchar(1000) DEFAULT NULL COMMENT ''")
    private String weixinGroups;

    @Column(name = "ding_groups",columnDefinition="varchar(1000) DEFAULT NULL COMMENT ''")
    private String dingGroups;

    @Column(name = "mobile_groups",columnDefinition="varchar(1000) DEFAULT NULL COMMENT ''")
    private String mobileGroups;

    @Column(name = "email_groups",columnDefinition="varchar(1000) DEFAULT NULL COMMENT ''")
    private String emailGroups;

    @Column(name = "all_groups",columnDefinition="varchar(1000) DEFAULT NULL COMMENT ''")
    private String allGroups;

    @Column(name = "item_id",columnDefinition="varchar(12) DEFAULT NULL COMMENT ''")
    private String itemId;

    @Column(name = "gname",columnDefinition="varchar(11) DEFAULT NULL COMMENT ''")
    private String gname;
}
