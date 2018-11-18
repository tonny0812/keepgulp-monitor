package com.keepgulp.monitor.entity.monitor.api;

import lombok.Data;

import java.util.ArrayList;

/**
 * Created by zhaoyun on 2017/7/4.
 */
@Data
public class PrometheusEntity {

    private String status;
    private ArrayList data;
    private String query;
    private String start;
    private String end;
    private String step;
}
