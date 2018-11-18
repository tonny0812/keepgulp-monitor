package com.keepgulp.monitor.entity.monitor.cluster;


import lombok.Data;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

/**
 */
@Entity
@Table(name = "t_monitor_cluster_configure")
@Data
public class MonitorClusterConfigureEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cluster_id",columnDefinition="int(11) COMMENT '主键'")
    private Integer clusterId;

    @Column(name = "cluster_name",columnDefinition="varchar(200) comment '集群名字'")
    private String clusterName;

    @Column(name = "cluster_hosts",columnDefinition="varchar(4000) comment '集群host'")
    private String clusterHosts;

    @LastModifiedDate
    @Column(name = "last_modify_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifyTime;

    @Column(name = "last_modify_user",columnDefinition="varchar(32) DEFAULT NULL COMMENT '最近修改用户'")
    private String lastModifyUser;

    @Column(name = "groups_id",columnDefinition="int(11) DEFAULT NULL COMMENT '组ID'")
    private Integer groupsId;

    private String groupsName;

    @Column(name = "description",columnDefinition="varchar(200) DEFAULT NULL COMMENT '描述信息'")
    private String description;

}