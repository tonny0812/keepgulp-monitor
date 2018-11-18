package com.keepgulp.monitor.entity.monitor.graph;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

/**
 */

@Entity
@Table(name = "t_monitor_images_collection")
@Data
public class MonitorImagesCollectionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "collection_id",columnDefinition="int(11) COMMENT '主键'")
    private Integer collectionId;

    @Column(name = "images",columnDefinition="text DEFAULT NULL COMMENT '收录图片地址'")
    private String images;

    @Column(name = "ip",columnDefinition="text comment 'ip地址'")
    private String ip;

    @CreatedDate
    @Column(name = "create_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;

    @Column(name = "create_user",columnDefinition="varchar(32) DEFAULT NULL COMMENT '创建人'")
    private String createUser;

    @LastModifiedDate
    @Column(name = "last_modify_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifyTime;

    @Column(name = "last_modify_user",columnDefinition="varchar(32) DEFAULT NULL COMMENT '最近修改用户'")
    private String lastModifyUser;

    @Column(name = "description",columnDefinition="varchar(100) DEFAULT NULL COMMENT '描述信息'")
    private String description;

}
