package com.keepgulp.monitor.entity.common;

import lombok.Data;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t_authority_user",
        uniqueConstraints = {@UniqueConstraint(columnNames="username")})
@Data
public class AuthorityUserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "`user_id`",columnDefinition="int(11) COMMENT '主键'")
    private Integer userId;

    @Column(name = "username",columnDefinition="varchar(32) DEFAULT NULL COMMENT '用户名'")
    private String username;

    @Column(name = "password",columnDefinition="varchar(32) DEFAULT NULL COMMENT '密码'")
    private String password;

    @LastModifiedDate
    @Column(name = "`last_login`")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastLogin;

    @Column(name = "`login_faild_count`",columnDefinition="int(11) DEFAULT NULL COMMENT '登录失败次数'")
    private Integer loginFaildCount;
}
