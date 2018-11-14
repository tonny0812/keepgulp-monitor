package com.keepgulp.monitor.entity.resource;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t_resource_server",
        uniqueConstraints = {@UniqueConstraint(columnNames="ip_address")})
@Data
public class ResourceServerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "server_id",columnDefinition="int(11) COMMENT '主键'")
    private Integer serverId;

    @Column(name = "groups_id",columnDefinition="int(11) COMMENT '业务线组'")
    private Integer groupsId;

    @Column(name = "type_id",columnDefinition="int(11) COMMENT '服务器类型'")
    private Integer typeId;

    @Column(name = "os_id",columnDefinition="int(11) COMMENT '参考操作 系统类型'")
    private Integer osId;

    @Column(name = "cabinet_id",columnDefinition="int(11) COMMENT '机柜ID'")
    private Integer cabinetId;

    @Column(name = "user_id",columnDefinition="int(32) DEFAULT NULL COMMENT '参考用户id,管理员'")
    private Integer userId;

    @Column(name = "service_id",columnDefinition="varchar(100) DEFAULT NULL COMMENT '参考服务类型ID,逗号分隔'")
    private String serviceId;

    @Column(name = "memory",columnDefinition="varchar(32) DEFAULT NULL COMMENT '内存大小'")
    private String memory;

    @Column(name = "cpu",columnDefinition="varchar(32) DEFAULT NULL COMMENT 'cpu个数'")
    private String cpu;

    @Column(name = "disk_size",columnDefinition="varchar(300) DEFAULT NULL COMMENT '硬盘大小'")
    private String diskSize;

    @Column(name = "host_id",columnDefinition="int(11) DEFAULT NULL COMMENT '参考宿主机ID,自己的表,类型为宿主机的'")
    private Integer hostId;

    @Column(name = "manager_ip",columnDefinition="varchar(32) DEFAULT NULL COMMENT '远程管理卡IP'")
    private String managerIp;

    @Column(name = "domain_name",columnDefinition="varchar(300) DEFAULT NULL COMMENT '域名'")
    private String domainName;

    @Column(name = "ent_id",columnDefinition="int(11) DEFAULT NULL COMMENT '参考环境管理,所属环境'")
    private Integer entId;

    @Column(name = "cabinet_level",columnDefinition="int(11) DEFAULT NULL COMMENT '所在机柜的位置'")
    private Integer cabinetLevel;

    @Column(name = "ip_address",columnDefinition="varchar(250) DEFAULT NULL COMMENT ''")
    private String ipAddress;

    @Column(name = "open_port",columnDefinition="varchar(200) DEFAULT NULL COMMENT '开放端口'")
    private String openPort;

    @Column(name = "asset_coding",columnDefinition="varchar(200) DEFAULT NULL COMMENT '资产编码'")
    private String assetCoding;

    @Column(name = "status",columnDefinition="int(11) DEFAULT NULL COMMENT '简单测试连通性,ping，检查是否活着'")
    private Integer status;

    @Column(name = "buy_user",columnDefinition="varchar(32) DEFAULT NULL COMMENT '购买人'")
    private String buyUser;

    @Column(name = "buy_user_history",columnDefinition="varchar(32) DEFAULT NULL COMMENT '原始购买者'")
    private String buyUserHistory;

    @Column(name = "buy_time",columnDefinition="varchar(32) DEFAULT NULL COMMENT '购买时间'")
    private String buyTime;

    @Column(name = "use_user",columnDefinition="varchar(32) DEFAULT NULL COMMENT '使用人'")
    private String useUser;

    @Column(name = "use_time",columnDefinition="varchar(32) DEFAULT NULL COMMENT '开始使用时间'")
    private String useTime;

    @Column(name = "resource_code",columnDefinition="varchar(64) DEFAULT NULL COMMENT '资产编码'")
    private String resourceCode;

    @Column(name = "resource_price",columnDefinition="varchar(64) DEFAULT NULL COMMENT '资产价格'")
    private String resourcePrice;

    @Column(name = "switch_id",columnDefinition="varchar(32) DEFAULT NULL COMMENT '交换机'")
    private String switchId;

    @Column(name = "switch_port",columnDefinition="varchar(32) DEFAULT NULL COMMENT '交换机端口'")
    private String switchPort;

    //过期时间
    @Column(name = "expire_time")
    private Date expireTime;

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

    @Column(name = "description",columnDefinition="varchar(300) DEFAULT NULL COMMENT '设备描述信息'")
    private String description;


    private String floorId;
    private String hostname;
    private String groupsName;
    private String entName;
    private String userName;
    private String osName;
    private String cabinetName;
    private String typeName;
    private String serviceName;
    private String hostIpAddress;
    private int cnt;
    private int number;
    private String email;
    private String k1;
    private String k2;

}