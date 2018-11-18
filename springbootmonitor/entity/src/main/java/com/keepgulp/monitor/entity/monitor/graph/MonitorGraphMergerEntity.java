package com.keepgulp.monitor.entity.monitor.graph;

import lombok.Data;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

/**
 */
@Entity
@Table(name = "t_monitor_graph_merger",
        uniqueConstraints = {@UniqueConstraint(columnNames="page")})
@Data
public class MonitorGraphMergerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "group_id",columnDefinition="int(11) COMMENT '主键'")
    private Integer graphId;

    @LastModifiedDate
    @Column(name = "last_modify_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifyTime;

    @Column(name = "last_modify_user",columnDefinition="varchar(32) DEFAULT NULL COMMENT '最近修改用户'")
    private String lastModifyUser;

    @Column(name = "description",columnDefinition="varchar(100) DEFAULT NULL COMMENT '描述信息'")
    private String description;

    @Column(name = "no",columnDefinition="int(11) DEFAULT NULL COMMENT ''")
    private Integer no;

    @Column(name = "to_images",columnDefinition="int(11) DEFAULT NULL COMMENT ''")
    private Integer toImages;

    @Column(name = "page",columnDefinition="varchar(50) DEFAULT NULL COMMENT '图像名称'")
    private String page;

    @Column(name = "images_gson",columnDefinition="text COMMENT ''")
    private String imagesGson;

}
