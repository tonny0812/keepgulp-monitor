package com.keepgulp.monitor.entity.monitor.graph;

import lombok.Data;

import java.util.ArrayList;

/**
 */
@Data
public class BindImageEntity {
    private String name;
    private String type;
    private String unit;
    private ArrayList<Double> data;
    private int valueDecimals;
}
