package com.keepgulp.monitor.entity.resource;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t_resource_service",
        uniqueConstraints = {@UniqueConstraint(columnNames="service_name")})
@Data
public class ResourceServiceEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "service_id",columnDefinition="int(11) COMMENT '服务类型id'")
    private Integer serviceId;

    @Column(name = "service_name",columnDefinition="varchar(32) DEFAULT NULL COMMENT '服务类型名称'")
    private String serviceName;

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
