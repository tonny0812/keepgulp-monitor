package com.keepgulp.monitor.entity.resource;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

/**
 */
@Entity
@Table(name = "t_resource_inventory",
        uniqueConstraints = {@UniqueConstraint(columnNames="title")})
@Data
public class ResourceInventoryEntity{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "inventory_id",columnDefinition="int(11) COMMENT '主键'")
    private Integer inventoryId;

    @Column(name = "title",columnDefinition="varchar(100) DEFAULT NULL COMMENT '中心标志'")
    private String title;

    @Column(name = "groups_id",columnDefinition="varchar(200) DEFAULT NULL COMMENT '中心拥有的组id'")
    private String groupsId;

    @Column(name = "inventory_number",columnDefinition="int(11) DEFAULT NULL COMMENT '库存数量'")
    private Integer inventoryNumber;

    @Column(name = "inventory_used",columnDefinition="int(11) DEFAULT NULL COMMENT '已使用数量'")
    private Integer inventoryUsed;

    @Column(name = "inventory_totle",columnDefinition="int(11) DEFAULT NULL COMMENT '库存总量'")
    private Integer inventoryTotle;

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


    // 获取数据库使用量
    private int dbUsed;
    // 获取测试环境购买量
    private String testBuyNumber;
    // 获取测试环境借用量
    private String testFromNumber;
    // 获取测试环境物理库存量
    private String testPhyInventoryNumber;
    // 获取测试环境已使用
    private String testVmUsedNumber;
    // 获取测试环境未使用库存
    private String testVmInventoryNumber;
    // 测试环境未使用库存
    private String testUnused;
    // 测试环境vm物理机使用
    private String testVmPhyNumber;
    // 测试环境应用物理机数量
    private int testPhyUsedNumber;

    // 获取测试环境购买量
    private String onlineBuyNumber;
    // 获取测试环境借用量
    private String onlineFromNumber;
    // 获取测试环境物理库存量
    private String onlinePhyInventoryNumber;
    // 获取测试环境未使用库存
    private String onlineVmInventoryNumber;
    // 生产环境未使用机器
    private String onlineUnused;
    // 测试环境vm物理机使用
    private String onlineVmPhyNumber;
    // 生产环境应用物理机数量
    private int onlinePhyUsedNumber;
    // 设置虚拟机库存数据量
    private int vmInventoryNumber;

    // 获取生产环境已使用
    private String onlineVmUsedNumber;

    // 获取借用库存
    private int fromInventory;

    // 获取每个虚拟机平均价格
    private int vmPrice;
    // 按单元计算虚拟机实例
    private int vmUnitsUsed;
    // 购买数量
    private int buyNumber;
    // 物理机库存，除虚拟化设备外的
    private int phyInventoryNumber;
    // 虚拟化主机使用量
    private int phyVmNumber;
    // 物理机已使用
    private int phyUsed;
    // 获取未使用库存
    private int unused;
}
