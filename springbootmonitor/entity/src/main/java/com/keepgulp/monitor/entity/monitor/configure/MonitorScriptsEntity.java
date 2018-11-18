package com.keepgulp.monitor.entity.monitor.configure;

import lombok.Data;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

/**
 */
@Entity
@Table(name = "t_monitor_scripts",
        uniqueConstraints = {@UniqueConstraint(columnNames={"monitor_name","monitor_name"})})
@Data
public class MonitorScriptsEntity {

    private int timeOut;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "scripts_id",columnDefinition="int(11) COMMENT '主键'")
    private Integer scriptsId;

    @LastModifiedDate
    @Column(name = "last_modify_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifyTime;

    @Column(name = "last_modify_user",columnDefinition="varchar(32) DEFAULT NULL COMMENT '最近修改用户'")
    private String lastModifyUser;

    @Column(name = "is_valid",columnDefinition="boolean DEFAULT NULL COMMENT '是否有效'")
    private Boolean isValid;

    @Column(name = "alarm_mess",columnDefinition="varchar(150) DEFAULT NULL COMMENT '报警消息'")
    private String alarmMess;

    @Column(name = "file_name",columnDefinition="varchar(200) DEFAULT NULL COMMENT '脚本名称'")
    private String fileName;

    @Column(name = "content",columnDefinition="text COMMENT '脚本内容'")
    private String content;

    @Column(name = "recover_mess",columnDefinition="varchar(150) DEFAULT NULL COMMENT '恢复信息'")
    private String recoverMess;

    @Column(name = "description",columnDefinition="varchar(150) DEFAULT NULL COMMENT '描述信息'")
    private String description;

    @Column(name = "monitor_name",columnDefinition="varchar(150) DEFAULT NULL COMMENT '监控名称'")
    private String monitorName;

    @Column(name = "arg1",columnDefinition="varchar(500) DEFAULT NULL COMMENT '参数1'")
    private String arg1;

    @Column(name = "arg2",columnDefinition="varchar(500) DEFAULT NULL COMMENT '参数2'")
    private String arg2;

    @Column(name = "arg3",columnDefinition="varchar(500) DEFAULT NULL COMMENT '参数3'")
    private String arg3;

    @Column(name = "arg4",columnDefinition="varchar(500) DEFAULT NULL COMMENT '参数4'")
    private String arg4;

    @Column(name = "arg5",columnDefinition="varchar(500) DEFAULT NULL COMMENT '参数5'")
    private String arg5;

    @Column(name = "arg6",columnDefinition="varchar(500) DEFAULT NULL COMMENT '参数6'")
    private String arg6;

    @Column(name = "arg7",columnDefinition="varchar(500) DEFAULT NULL COMMENT '参数7'")
    private String arg7;

    @Column(name = "arg8",columnDefinition="varchar(500) DEFAULT NULL COMMENT '参数8'")
    private String arg8;

    @Column(name = "arg8comm",columnDefinition="varchar(100) DEFAULT NULL COMMENT '参数8描述'")
    private String arg8comm;

    @Column(name = "arg7comm",columnDefinition="varchar(100) DEFAULT NULL COMMENT '参数7描述'")
    private String arg7comm;

    @Column(name = "arg6comm",columnDefinition="varchar(100) DEFAULT NULL COMMENT '参数6描述'")
    private String arg6comm;

    @Column(name = "arg5comm",columnDefinition="varchar(100) DEFAULT NULL COMMENT '参数5描述'")
    private String arg5comm;

    @Column(name = "arg4comm",columnDefinition="varchar(100) DEFAULT NULL COMMENT '参数4描述'")
    private String arg4comm;

    @Column(name = "arg3comm",columnDefinition="varchar(100) DEFAULT NULL COMMENT '参数3描述'")
    private String arg3comm;

    @Column(name = "arg2comm",columnDefinition="varchar(100) DEFAULT NULL COMMENT '参数2描述'")
    private String arg2comm;

    @Column(name = "arg1comm",columnDefinition="varchar(100) DEFAULT NULL COMMENT '参数1描述'")
    private String arg1comm;

    @Column(name = "anew",columnDefinition="int(11) DEFAULT NULL COMMENT '多长时间重新发送'")
    private Integer anew;

    @Column(name = "is_recover",columnDefinition="boolean DEFAULT NULL COMMENT '是否发送恢复'")
    private Boolean isRecover;

}
