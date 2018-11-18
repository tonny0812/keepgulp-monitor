package com.keepgulp.monitor.entity.monitor.configure;

import lombok.Data;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

/**
 */
@Entity
@Table(name = "t_monitor_system_scripts")
@Data
public class MonitorSystemScriptsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "group_id",columnDefinition="int(11) COMMENT '主键'")
    private Integer scriptsId;

    @Column(name = "scripts_content",columnDefinition="text COMMENT '脚本内容'")
    private String scriptsContent;

    @Column(name = "os_name",columnDefinition="varchar(32) DEFAULT NULL COMMENT '操作系统类型'")
    private String osName;

    @LastModifiedDate
    @Column(name = "last_modify_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifyTime;

    @Column(name = "last_modify_user",columnDefinition="varchar(32) DEFAULT NULL COMMENT '最近修改用户'")
    private String lastModifyUser;

    @Column(name = "description",columnDefinition="varchar(100) DEFAULT NULL COMMENT '描叙信息'")
    private String description;

}
