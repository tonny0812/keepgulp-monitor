package com.keepgulp.monitor.entity.resource;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t_resource_server_type",
        uniqueConstraints = {@UniqueConstraint(columnNames="type_name")})
@Data
public class ResourceServerTypeEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "type_id",columnDefinition="int(11) COMMENT '主键'")
    private Integer typeId;

    @Column(name = "type_name",columnDefinition="varchar(32) DEFAULT NULL COMMENT ''")
    private String typeName;

    @Column(name = "image_path",columnDefinition="varchar(200) DEFAULT NULL COMMENT '图片路径'")
    private String imagePath;

    @Column(name = "depend",columnDefinition="varchar(5) DEFAULT NULL COMMENT '参考的类型'")
    private String depend;

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

    //引用的列明
    private String tname;
}
