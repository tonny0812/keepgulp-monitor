package com.keepgulp.monitor.entity.monitor.graph;

import lombok.Data;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

/**
 */
@Entity
@Table(name = "t_monitor_graph_template")
@Data
public class MonitorGraphTemplateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "template_id",columnDefinition="int(11) COMMENT '主键'")
    private Integer templateId;

    @Column(name = "graph_ids",columnDefinition="text COMMENT '图像ID'")
    private String graphIds;

    @LastModifiedDate
    @Column(name = "last_modify_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifyTime;

    @Column(name = "last_modify_user",columnDefinition="varchar(32) DEFAULT NULL COMMENT '最近修改用户'")
    private String lastModifyUser;

    @Column(name = "description",columnDefinition="varchar(100) DEFAULT NULL COMMENT '描述信息'")
    private String description;

    @Column(name = "page",columnDefinition="varchar(50) DEFAULT NULL COMMENT '页面名称'")
    private String page;

    @Column(name = "gson_data",columnDefinition="text DEFAULT NULL COMMENT '模板数据'")
    private String gsonData;

}
