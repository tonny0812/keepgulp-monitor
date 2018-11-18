package com.keepgulp.monitor.entity.monitor.configure;

import lombok.Data;

import javax.persistence.*;

/**
 */
@Entity
@Table(name = "t_monitor_information")
@Data
public class MonitorInformationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "information_id",columnDefinition="int(11) COMMENT '主键'")
    private Integer informationId;

    @Column(name = "server_id",columnDefinition="int(11) DEFAULT NULL COMMENT '主机ip，参考资源的server_id'")
    private Integer serverId;

    @Column(name = "script_id",columnDefinition="int(11) DEFAULT NULL COMMENT '脚本id，参考脚本id'")
    private Integer scriptId;

    @Column(name = "next_time",columnDefinition="int(11) DEFAULT NULL COMMENT '下次检查时间'")
    private Integer nextTime;

    @Column(name = "severity_id",columnDefinition="int(11) DEFAULT NULL COMMENT '报警状态，参考serverity_id'")
    private Integer severityId;

    @Column(name = "info",columnDefinition="varchar(3000) DEFAULT NULL")
    private String info;

    @Column(name = "notice_number",columnDefinition="int(11) DEFAULT NULL COMMENT '监控报警次数'")
    private Integer noticeNumber;

    @Column(name = "groups_id",columnDefinition="int(11) DEFAULT NULL COMMENT '业务线id，参考cmdb的业务线id'")
    private String groupsId;

}
