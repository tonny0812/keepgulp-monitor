package com.keepgulp.monitor.entity.resource;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t_resource_cabinet",
        uniqueConstraints = {@UniqueConstraint(columnNames="cabinet_name")})
@Data
public class ResourceCabinetEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pages_id",columnDefinition="int(11) COMMENT '机柜编号'")
    private Integer cabinetId;

    @Column(name = "cabinet_name",columnDefinition="varchar(200) DEFAULT NULL COMMENT '机柜名称'")
    private String cabinetName;

    @Column(name = "floor_id",columnDefinition="int(11) DEFAULT NULL")
    private Integer floorId;

//    @Column(name = "floor_addreess",columnDefinition="varchar(64) DEFAULT NULL")
//    private String floorAddress;
//
//    @Column(name = "floor_name",columnDefinition="varchar(32) DEFAULT NULL")
//    private String floorName;

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

    @Column(name = "cabinet_scope",columnDefinition="varchar(32) DEFAULT NULL COMMENT '机柜所属区域'")
    private String cabinetScope;

      // 最多存放设备
    @Column(name = "number",columnDefinition="int(11) DEFAULT NULL COMMENT '最多存放设备'")
    private int number;

}
