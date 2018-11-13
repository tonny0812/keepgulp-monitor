package com.keepgulp.monitor.entity.common;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t_authority_log")
@Data
public class AuthorityLogEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "log_id",columnDefinition="int(11) COMMENT '主键'")
    private Integer logId;

    @Column(name = "ip",columnDefinition="varchar(32) COMMENT 'IP地址'")
    private String ip;

    @Column(name = "user",columnDefinition="varchar(32) COMMENT '用户'")
    private String user;

    @CreatedDate
    @Column(name = "time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date time;

    @Lob
    @Column(name = "info", columnDefinition="TEXT COMMENT '信息'")
    private String info;
}
