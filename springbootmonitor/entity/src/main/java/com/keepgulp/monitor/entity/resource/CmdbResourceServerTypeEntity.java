package com.keepgulp.monitor.entity.resource;

import lombok.Data;

import java.util.Date;

@Data
public class CmdbResourceServerTypeEntity{

    private String lastModifyTime;
    private String imagePath;
    private String depend;

    //引用的列明
    private String tname;

    private Integer typeId;

    private String typeName;

    private Date createTime;

    private String createUser;

    private String lastModifyUser;

}
