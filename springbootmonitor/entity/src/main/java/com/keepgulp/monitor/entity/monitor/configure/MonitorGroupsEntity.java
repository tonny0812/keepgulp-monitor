package com.keepgulp.monitor.entity.monitor.configure;


import lombok.Data;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

/**
 */
@Entity
@Table(name = "t_monitor_groups",
        uniqueConstraints = {@UniqueConstraint(columnNames={"groups_name","other_name"})})
@Data
public class MonitorGroupsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "groups_id",columnDefinition="int(11) COMMENT '主键'")
    private Integer groupsId;

    @Column(name = "groups_name",columnDefinition="varchar(200) DEFAULT NULL COMMENT '组名称'")
    private String groupsName;

    @LastModifiedDate
    @Column(name = "last_modify_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifyTime;

    @Column(name = "last_modify_user",columnDefinition="varchar(32) DEFAULT NULL COMMENT '最近修改用户'")
    private String lastModifyUser;

    @Column(name = "is_valid",columnDefinition="BOOLEAN DEFAULT FALSE COMMENT '是否有效'")
    private Boolean isValid;

    // 业务组名称
    private String gname;

    // 组附加名称
    @Column(name = "other_name",columnDefinition="varchar(100) DEFAULT NULL COMMENT '组别名'")
    private String otherName;

    @Column(name = "hosts",columnDefinition="text COMMENT '拥有主机'")
    private String hosts;
    //  ip地址
    private String ipList;

}
