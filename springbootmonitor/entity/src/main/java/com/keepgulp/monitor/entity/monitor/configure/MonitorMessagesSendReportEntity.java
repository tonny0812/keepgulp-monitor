package com.keepgulp.monitor.entity.monitor.configure;

import lombok.Data;

/**
 * 报警信息发送统计
 * @author zhaozq
 * @version 1.0
 * @since 1.0
 */
@Data
public class MonitorMessagesSendReportEntity {
    private String messagesTime;
    private String dingCount;
    private String emailCount;
    private String mobileCount;
    private String weixinCount;
}
