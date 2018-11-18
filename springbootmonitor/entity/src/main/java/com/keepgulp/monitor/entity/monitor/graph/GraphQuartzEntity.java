package com.keepgulp.monitor.entity.monitor.graph;

import lombok.Data;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

/**
 */
@Entity
@Table(name = "t_graph_quartz")
@Data
public class GraphQuartzEntity {

    @Id
    @Column(name = "name",columnDefinition="varchar(200) NOT NULL COMMENT '只要名字在，就不执行，等于一个锁'")
    private String name;

    @Column(name = "ip_address",columnDefinition="varchar(32) DEFAULT NULL COMMENT '哪个ip地址添加的'")
    private String ipAddress;

    @Column(name = "create_time",columnDefinition="datetime DEFAULT NULL COMMENT '添加时间'")
    private Date createTime;

}
