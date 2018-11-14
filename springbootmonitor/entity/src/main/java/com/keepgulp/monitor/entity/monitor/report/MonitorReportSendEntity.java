package com.keepgulp.monitor.entity.monitor.report;


import lombok.Data;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

/**
 */
@Entity
@Table(name = "t_monitor_report_send",
        uniqueConstraints = {@UniqueConstraint(columnNames="groups_id")})
@Data
public class MonitorReportSendEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "send_id",columnDefinition="int(11) COMMENT '主键'")
    private Integer sendId;

    @Column(name = "groups_id",columnDefinition="int(11) DEFAULT NULL COMMENT '参数资源的组id'")
    private Integer groupsId;

    @Column(name = "emails",columnDefinition="varchar(200) DEFAULT NULL COMMENT '自动发送报表信息的邮件地址多个用逗号分隔'")
    private String emails;

    @LastModifiedDate
    @Column(name = "last_modify_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifyTime;

    @Column(name = "last_modify_user",columnDefinition="varchar(32) DEFAULT NULL COMMENT '最近修改用户'")
    private String lastModifyUser;

    private String groupsName;
}
