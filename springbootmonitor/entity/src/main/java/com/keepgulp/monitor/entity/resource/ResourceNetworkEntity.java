package com.keepgulp.monitor.entity.resource;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

/**
 */
@Entity
@Table(name = "t_resource_network",
        uniqueConstraints = {@UniqueConstraint(columnNames={"network_prefix", "vlan"})})
@Data
public class ResourceNetworkEntity{

    private int free;
    private int used;
    private int status;


    private int cnt;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "network_id",columnDefinition="int(11) COMMENT '主键'")
    private Integer networkId;

    @Column(name = "network_prefix",columnDefinition="varchar(100) DEFAULT NULL COMMENT '前缀'")
    private String networkPrefix;

    @Column(name = "network_suffix",columnDefinition="varchar(100) DEFAULT NULL COMMENT '后缀'")
    private Integer networkSuffix;

    @Column(name = "netmask",columnDefinition="varchar(32) DEFAULT NULL COMMENT '子网掩码'")
    private String netmask;

    @Column(name = "gateway",columnDefinition="varchar(32) DEFAULT NULL COMMENT '网关地址'")
    private String gateway;

    @Column(name = "nameserver",columnDefinition="varchar(32) DEFAULT NULL COMMENT '多个逗号分隔,最多3个'")
    private String nameserver;

    @Column(name = "vlan",columnDefinition="varchar(10) DEFAULT NULL COMMENT '网络所在vlan'")
    private String vlan;

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

    @Column(name = "description",columnDefinition="varchar(100) DEFAULT NULL COMMENT '描述信息'")
    private String description;

}
