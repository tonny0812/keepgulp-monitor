package com.keepgulp.monitor.entity.monitor.graph;

import lombok.Data;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

/**
 */
@Entity
@Table(name = "t_monitor_images_merger")
@Data
public class MonitorImagesMergerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "group_id",columnDefinition="int(11) COMMENT '主键'")
    private Integer imageId;

    @Column(name = "image_tp",columnDefinition="varchar(32) DEFAULT NULL COMMENT '图像类型'")
    private String imageTp;

    @Column(name = "image_left",columnDefinition="int(11) DEFAULT NULL COMMENT '图像左面位置'")
    private Integer imageLeft;

    @Column(name = "image_top",columnDefinition="int(11) DEFAULT NULL COMMENT '图像上面位置'")
    private Integer imageTop;

    @Column(name = "image_to",columnDefinition="varchar(200) DEFAULT NULL COMMENT '所属图像'")
    private String imageTo;

    @Column(name = "is_grid",columnDefinition="BOOLEAN DEFAULT NULL COMMENT '是否显示网格'")
    private Boolean isGrid;

    @Column(name = "image_grid_size",columnDefinition="varchar(32) DEFAULT NULL COMMENT '网格粗细'")
    private String imageGridSize;

    @Column(name = "is_legend",columnDefinition="BOOLEAN DEFAULT NULL COMMENT '是否显示图例'")
    private String isLegend;

    @Column(name = "image_legend_location",columnDefinition="varchar(32) DEFAULT NULL COMMENT '图例位置'")
    private String imageLegendLocation;

    @Column(name = "image_data_source",columnDefinition="varchar(100) DEFAULT NULL COMMENT '数据源'")
    private String imageDataSource;

    @Column(name = "image_data_tp",columnDefinition="varchar(32) DEFAULT NULL COMMENT '数据类型'")
    private String imageDataTp;

    @Column(name = "image_background_colr",columnDefinition="varchar(32) DEFAULT NULL COMMENT '背景颜色'")
    private String imageBackgroundColr;

    @Column(name = "image_color",columnDefinition="varchar(32) DEFAULT NULL COMMENT '图像颜色'")
    private String imageColor;

    @Column(name = "image_name",columnDefinition="varchar(32) DEFAULT NULL COMMENT '图像名称'")
    private String imageName;

    @Column(name = "image_line_size",columnDefinition="varchar(32) DEFAULT NULL COMMENT '线条粗细'")
    private String imageLineSize;

    @LastModifiedDate
    @Column(name = "last_modify_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifyTime;

    @Column(name = "last_modify_user",columnDefinition="varchar(32) DEFAULT NULL COMMENT '最近修改用户'")
    private String lastModifyUser;

    @Column(name = "description",columnDefinition="varchar(200) DEFAULT NULL COMMENT '描述信息'")
    private String description;

    @Column(name = "tilte",columnDefinition="varchar(64) DEFAULT NULL COMMENT '图像title'")
    private String tilte;

    @Column(name = "images_width",columnDefinition="varchar(200) DEFAULT NULL COMMENT '图像宽度'")
    private String imagesWidth;

    @Column(name = "images_height",columnDefinition="varchar(200) DEFAULT NULL COMMENT '图像高度'")
    private String imagesHeight;

    @Column(name = "images_data_interval",columnDefinition="varchar(32) DEFAULT NULL COMMENT '图像数据时长'")
    private String imagesDataInterval;

    @Column(name = "images_left_title",columnDefinition="varchar(32) DEFAULT NULL COMMENT '左面title, x轴'")
    private String imagesLeftTitle;

    @Column(name = "images_sub_title",columnDefinition="varchar(32) DEFAULT NULL COMMENT '子title'")
    private String imagesSubTitle;

}
