package com.keepgulp.monitor.entity.resource;

import lombok.Data;

import java.util.Date;

@Data
public class CmdbResourceCabinetEntity{

    private String lastModifyTime;
    private String floorAddress;
    private String floorName;
    private String cabinetScope;

    // 最多存放设备
    private int number;

    private Integer cabinetId;


    private String cabinetName;


    private Integer floorId;


    private Date createTime;


    private String createUser;


    private String lastModifyUser;
}
