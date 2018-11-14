package com.keepgulp.monitor.entity.resource;

import lombok.Data;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

/**
 *
 */
@Entity
@Table(name = "t_resource_network_address",
        uniqueConstraints = {@UniqueConstraint(columnNames={"ip_prefix_id","ip_subffix"})})
@Data
public class ResourceNetworkAddressEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",columnDefinition="int(11) COMMENT '主键'")
    private Integer id;

    @Column(name = "ip_prefix_id",columnDefinition="int(11) DEFAULT NULL COMMENT '参考网络的id'")
    private Integer ipPrefixId;

    @Column(name = "ip_subffix",columnDefinition="int(11) DEFAULT NULL COMMENT 'ip地址后缀'")
    private Integer ipSubffix;

    @Column(name = "ip_subffix",columnDefinition="int(11) DEFAULT NULL COMMENT '使用状态'")
    private Integer status;

    @LastModifiedDate
    @Column(name = "last_modify_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifyTime;

    private int cnt;
    private String ipAddress;
}
