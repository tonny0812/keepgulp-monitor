package com.keepgulp.monitor.entity.monitor.configure;


import lombok.Data;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

/**
 */
@Entity
@Table(name = "t_monitor_contacts",
        uniqueConstraints = {@UniqueConstraint(columnNames={"member_name","mobile","mail"})})
@Data
public class MonitorContactsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "contacts_id",columnDefinition="int(11) COMMENT '主键'")
    private Integer contactsId;

    @Column(name = "member_name",columnDefinition="varchar(30) DEFAULT NULL COMMENT ''")
    private String memberName;

    @Column(name = "mobile",columnDefinition="varchar(11) DEFAULT NULL COMMENT ''")
    private String mobile;

    @Column(name = "mail",columnDefinition="varchar(50) DEFAULT NULL COMMENT ''")
    private String mail;

    @Column(name = "no",columnDefinition="varchar(30) DEFAULT NULL COMMENT '工号'")
    private String no;

    @LastModifiedDate
    @Column(name = "last_modify_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifyTime;

    @Column(name = "last_modify_user",columnDefinition="varchar(32) DEFAULT NULL COMMENT '最近修改用户'")
    private String lastModifyUser;

}
