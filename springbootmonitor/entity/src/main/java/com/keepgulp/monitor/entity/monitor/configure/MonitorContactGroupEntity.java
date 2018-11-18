package com.keepgulp.monitor.entity.monitor.configure;

import lombok.Data;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "t_monitor_contact_group",
        uniqueConstraints = {@UniqueConstraint(columnNames="group_name")})
@Data
public class MonitorContactGroupEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "group_id",columnDefinition="int(11) COMMENT '主键'")
    private Integer groupId;

    @Column(name = "group_name",columnDefinition="varchar(50) DEFAULT NULL COMMENT '组名字'")
    private String groupName;

    @Column(name = "description",columnDefinition="varchar(200) DEFAULT NULL COMMENT '描述信息'")
    private String description;

    @Column(name = "member",columnDefinition="varchar(100) DEFAULT NULL COMMENT '组成员'")
    private String member;

    @Column(name = "is_mail",columnDefinition="BOOLEAN DEFAULT NULL COMMENT '是否有效'")
    private Boolean isMail;

    @Column(name = "is_mobile",columnDefinition="BOOLEAN DEFAULT NULL COMMENT '是否有效'")
    private Integer isMobile;

    @Column(name = "status",columnDefinition="int(11) DEFAULT NULL COMMENT '状态'")
    private Integer status;

    @LastModifiedDate
    @Column(name = "last_modify_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifyTime;

    @Column(name = "last_modify_user",columnDefinition="varchar(32) DEFAULT NULL COMMENT '最近修改用户'")
    private String lastModifyUser;

    /**
     * 是否是管理员
     */
    @Column(name = "is_admin",columnDefinition="BOOLEAN DEFAULT FALSE COMMENT '是否是管理员组,所有报警都发送到管理员组'")
    private Boolean isAdmin;
}
