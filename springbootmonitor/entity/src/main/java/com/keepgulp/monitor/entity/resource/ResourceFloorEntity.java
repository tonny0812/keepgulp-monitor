package com.keepgulp.monitor.entity.resource;


import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

/**
 *
 */
@Entity
@Table(name = "t_resource_floor")
@Data
public class ResourceFloorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "floor_id",columnDefinition="int(11) COMMENT '机房编号'")
    private Integer floorId;

    @Column(name = "floor_name",columnDefinition="varchar(1000) DEFAULT NULL COMMENT '机房楼层名称'")
    private String floorName;

    @Column(name = "floor_address",columnDefinition="varchar(1000) DEFAULT NULL COMMENT '机房楼层地址'")
    private String floorAddress;

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
}
