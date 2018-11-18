package com.keepgulp.monitor.entity.resource;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 */
@Entity
@Table(name = "t_resource_user")
@Data
public class ResourceUserEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id",columnDefinition="int(11) COMMENT '用户ID'")
    private Integer userId;

    @Column(name = "user_name",columnDefinition="varchar(100) DEFAULT NULL COMMENT '用户名称'")
    private String userName;

    @Column(name = "email",columnDefinition="varchar(100) DEFAULT NULL COMMENT ''")
    private String email;

    @Column(name = "mobile",columnDefinition="varchar(11) DEFAULT NULL COMMENT ''")
    private String mobile;

    @Column(name = "groups_id",columnDefinition="int(11) DEFAULT NULL COMMENT '业务线组'")
    private Integer groupsId;

    private String groupsName;


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
