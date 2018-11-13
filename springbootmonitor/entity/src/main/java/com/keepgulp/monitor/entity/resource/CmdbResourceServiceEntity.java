package com.keepgulp.monitor.entity.resource;

import lombok.Data;

import java.util.Date;

@Data
public class CmdbResourceServiceEntity{
    private String lastModifyTime;

    private String switchId;
    private String switchPort;

    private Integer serviceId;

    private String serviceName;

    private Date createTime;


    private String createUser;


    private String lastModifyUser;

}
