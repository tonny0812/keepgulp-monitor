package com.keepgulp.monitor.entity.authority;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t_authority_pages",
        uniqueConstraints = {@UniqueConstraint(columnNames="pages_url")})
@Data
public class AuthorityPagesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pages_id",columnDefinition="int(11) COMMENT '主键'")
    private Integer pagesId;

    @Column(name = "pages_url",columnDefinition="varchar(200) DEFAULT NULL COMMENT '访问页面URL'")
    private String pagesUrl;

    @Column(name = "pages_name",columnDefinition="varchar(100) DEFAULT NULL COMMENT '菜单名字'")
    private String pagesName;

    @Column(name = "last_modify_user",columnDefinition="varchar(4000) DEFAULT NULL COMMENT '最近修改用户'")
    private String lastModifyUser;

    @CreatedDate
    @Column(name = "time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;

    @LastModifiedDate
    @Column(name = "last_modify_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifyTime;

    @Column(columnDefinition="tinyint(1) default 1 COMMENT '是否有效'" )
    private Boolean isValid;

    @Column(name = "model_name",columnDefinition="varchar(100) DEFAULT NULL COMMENT '所属模块'")
    private String modelName;
}
