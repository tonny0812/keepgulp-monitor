package com.keepgulp.monitor.entity.monitor.configure;


import lombok.Data;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

/**
 */
@Entity
@Table(name = "t_monitor_index_from_scripts",
        uniqueConstraints = {@UniqueConstraint(columnNames="index_name")})
@Data
public class MonitorIndexFromScriptsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "index_id",columnDefinition="int(11) COMMENT '主键'")
    private Integer indexId;

    @Column(name = "index_name",columnDefinition="varchar(100) DEFAULT NULL COMMENT '指标名称'")
    private String indexName;

    @Column(name = "scripts_id",columnDefinition="int(11) DEFAULT NULL COMMENT '指标属于的脚本'")
    private Integer scriptsId;

    @Column(name = "unit",columnDefinition="varchar(10) DEFAULT NULL COMMENT '指标单元'")
    private String unit;

    @LastModifiedDate
    @Column(name = "last_modify_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifyTime;

    @Column(name = "last_modify_user",columnDefinition="varchar(32) DEFAULT NULL COMMENT '最近修改用户'")
    private String lastModifyUser;


    private String fileName;


    @Column(name = "description",columnDefinition="varchar(32) DEFAULT NULL COMMENT '描述信息'")
    private String description;

}
