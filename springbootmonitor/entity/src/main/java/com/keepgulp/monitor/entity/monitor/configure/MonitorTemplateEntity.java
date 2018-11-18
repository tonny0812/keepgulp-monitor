package com.keepgulp.monitor.entity.monitor.configure;

import lombok.Data;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

/**
 */
@Entity
@Table(name = "t_monitor_template",
        uniqueConstraints = {@UniqueConstraint(columnNames="template_name")})
@Data
public class MonitorTemplateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "template_id",columnDefinition="int(11) COMMENT '主键'")
    private Integer templateId;

    @Column(name = "template_name",columnDefinition="varchar(200) DEFAULT NULL COMMENT '模板名称'")
    private String templateName;

    @Column(name = "templates",columnDefinition="text COMMENT '模板拥有的模板'")
    private String templates;

    @LastModifiedDate
    @Column(name = "last_modify_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifyTime;

    @Column(name = "last_modify_user",columnDefinition="varchar(32) DEFAULT NULL COMMENT '最近修改用户'")
    private String lastModifyUser;

    @Column(name = "is_valid",columnDefinition="BOOLEAN DEFAULT TRUE COMMENT '是否有效'")
    private Boolean isValid;

    @Column(name = "items",columnDefinition="varchar(4000) DEFAULT NULL COMMENT '监控项目,多个用逗号分隔'")
    private String items;

    @Column(name = "description",columnDefinition="varchar(200) DEFAULT NULL COMMENT '描叙信息'")
    private String description;

    private String itemName;
    private String itemId;
}
