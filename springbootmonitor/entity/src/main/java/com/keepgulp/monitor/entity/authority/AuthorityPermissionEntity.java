package com.keepgulp.monitor.entity.authority;


import lombok.Data;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t_authority_permission")
@Data
public class AuthorityPermissionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "permission_id",columnDefinition="int(11) COMMENT '主键'")
    private Integer permissionId;

    @Column(name = "pages_id",columnDefinition="int(11) DEFAULT NULL COMMENT '页面id参考pages'")
    private Integer pagesId;

    @Column(name = "last_modify_user",columnDefinition="varchar(32) DEFAULT NULL COMMENT '最近修改人'")
    private String lastModifyUser;

    @LastModifiedDate
    @Column(name = "last_modify_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifyTime;

    @Column(name = "user",columnDefinition="varchar(32) DEFAULT NULL COMMENT '用户名'")
    private String user;

    @Column(columnDefinition="tinyint(1) default 1 COMMENT '是否有效'" )
    private Integer isValid;

}
