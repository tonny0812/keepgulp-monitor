package com.keepgulp.monitor.entity.monitor.graph;

import lombok.Data;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

/**
 */
@Entity
@Table(name = "t_monitor_graph_auto_play")
@Data
public class MonitorGraphAutoPlayEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "play_id",columnDefinition="int(11) COMMENT '主键'")
    private Integer playId;

    @LastModifiedDate
    @Column(name = "last_modify_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifyTime;

    @Column(name = "last_modify_user",columnDefinition="varchar(32) DEFAULT NULL COMMENT '最近修改用户'")
    private String lastModifyUser;

    @Column(name = "url",columnDefinition="varchar(100) DEFAULT NULL COMMENT '要播放的url'")
    private String url;

    @Column(name = "description",columnDefinition="varchar(100) DEFAULT NULL COMMENT '描述信息'")
    private String description;

    @Column(name = "intervals",columnDefinition="int(11) DEFAULT NULL COMMENT '刷新间隔'")
    private Integer intervals;

}
