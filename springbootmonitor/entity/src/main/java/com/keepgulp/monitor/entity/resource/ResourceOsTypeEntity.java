package com.keepgulp.monitor.entity.resource;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

/**
 */
@Entity
@Table(name = "t_resource_os_type",
        uniqueConstraints = {@UniqueConstraint(columnNames="os_name")})
@Data
public class ResourceOsTypeEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "os_id",columnDefinition="int(11) COMMENT '主键'")
    private Integer osId;

    @Column(name = "os_name",columnDefinition="varchar(132) DEFAULT NULL COMMENT '操作系统名称'")
    private String osName;

    @Column(name = "image_path",columnDefinition="varchar(32) DEFAULT NULL COMMENT '图片路径'")
    private String imagePath;

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
