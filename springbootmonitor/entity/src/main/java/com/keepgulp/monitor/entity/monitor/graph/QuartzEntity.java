package com.keepgulp.monitor.entity.monitor.graph;

import lombok.Data;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

/**
 */
@Entity
@Table(name = "t_quartz",
        uniqueConstraints = {@UniqueConstraint(columnNames="quartz_name")})
@Data
public class QuartzEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "quartz_id",columnDefinition="int(11) COMMENT '主键'")
    private Integer quartzId;

    @Column(name = "quartz_name",columnDefinition="varchar(32) DEFAULT NULL COMMENT '任务名称'")
    private String quartzName;

    @Column(name = "quartz_url",columnDefinition="varchar(300) DEFAULT NULL COMMENT '任务接口地址'")
    private String quartzUrl;

    @Column(name = "quartz_time",columnDefinition="int(11) DEFAULT NULL COMMENT '任务执行时间, 秒'")
    private Integer quartzTime;

    @Column(name = "description",columnDefinition="varchar(200) DEFAULT NULL COMMENT '描述信息'")
    private String description;

    @LastModifiedDate
    @Column(name = "last_modify_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifyTime;

    @Column(name = "last_modify_user",columnDefinition="varchar(32) DEFAULT NULL COMMENT '最近修改用户'")
    private String lastModifyUser;
}
