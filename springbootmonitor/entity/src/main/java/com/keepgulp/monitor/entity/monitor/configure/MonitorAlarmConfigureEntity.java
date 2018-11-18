package com.keepgulp.monitor.entity.monitor.configure;

import lombok.Data;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

/**
 */
@Entity
@Table(name = "t_monitor_alarm_configure")
@Data
public class MonitorAlarmConfigureEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "configure_id",columnDefinition="int(11) COMMENT '主键'")
    private Integer configureId;

    @Column(name = "description",columnDefinition="varchar(200) DEFAULT NULL COMMENT '描述信息'")
    private String description;

    @LastModifiedDate
    @Column(name = "last_modify_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifyTime;

    @Column(name = "last_modify_user",columnDefinition="varchar(32) DEFAULT NULL COMMENT '最近修改用户'")
    private String lastModifyUser;

    @Column(name = "ent_id",columnDefinition="varchar(5) comment '对不同的环境接报警'")
    private String entId;

    @Column(name = "hosts",columnDefinition="varchar(1000) comment '对不同的主机接收任何报警'")
    private String hosts;

    @Column(name = "item_id",columnDefinition="varchar(6) comment '对不同的项目进行报警'")
    private String itemId;

    @Column(name = "start_time",columnDefinition="varchar(11) comment '报警开始接收时间'")
    private String startTime;

    @Column(name = "end_time",columnDefinition="varchar(11) comment '报警完成时间'")
    private String endTime;

    @Column(name = "all_groups",columnDefinition="varchar(1000) comment '接收报警组'")
    private String allGroups;

    @Column(name = "gson_data",columnDefinition="varchar(1000) comment '其他数据'")
    private String gsonData;
}
