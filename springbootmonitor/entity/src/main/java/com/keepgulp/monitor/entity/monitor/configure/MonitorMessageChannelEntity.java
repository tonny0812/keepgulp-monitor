package com.keepgulp.monitor.entity.monitor.configure;

import lombok.Data;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

/**
 */

@Entity
@Table(name = "t_monitor_message_channel",
        uniqueConstraints = {@UniqueConstraint(columnNames="channel_tp")})
@Data
public class MonitorMessageChannelEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "channel_id",columnDefinition="int(11) COMMENT '主键'")
    private Integer channelId;

    @Column(name = "channel_tp",columnDefinition="varchar(20) DEFAULT NULL COMMENT ''")
    private String channelTp;

    @Column(name = "channel_script",columnDefinition="text COMMENT '发送脚本'")
    private String channelScript;

    @LastModifiedDate
    @Column(name = "last_modify_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifyTime;

    @Column(name = "last_modify_user",columnDefinition="varchar(32) DEFAULT NULL COMMENT '最近修改用户'")
    private String lastModifyUser;

    @Column(name = "is_valid",columnDefinition="boolean DEFAULT NULL COMMENT '是否有效'")
    private Boolean isValid;

    @Column(name = "smtp_server",columnDefinition="varchar(60) DEFAULT NULL COMMENT '发送有服务器地址'")
    private String smtpServer;

    @Column(name = "smtp_user",columnDefinition="varchar(30) DEFAULT NULL COMMENT '发送有服务器用户名'")
    private String smtpUser;

    @Column(name = "smtp_pass",columnDefinition="varchar(30) DEFAULT NULL COMMENT '发送有服务器用户名密码'")
    private String smtpPass;

    @Column(name = "smtp_auth",columnDefinition="varchar(30) DEFAULT NULL COMMENT '发送服务器是否使用用户名密码'")
    private String smtpAuth;

    @Column(name = "mail_template",columnDefinition="text COMMENT '邮件模板'")
    private String mailTemplate;

    @Column(name = "smtp_sender",columnDefinition="varchar(50) DEFAULT NULL COMMENT '向用户显示的邮件地址'")
    private String smtpSender;

    @Column(name = "ding_corp_id",columnDefinition="varchar(200) DEFAULT NULL COMMENT '钉钉的CorpID'")
    private String dingCorpId;

    @Column(name = "ding_secret_id",columnDefinition="varchar(200) DEFAULT NULL COMMENT '钉钉的SecretId'")
    private String dingSecretId;

    @Column(name = "ding_agent_id",columnDefinition="bigint(20) DEFAULT NULL COMMENT '钉钉的agentid'")
    private BigInteger dingAgentId;

    @Column(name = "weixin_corp_id",columnDefinition="varchar(200) DEFAULT NULL COMMENT ''")
    private String weixinCorpId;

    @Column(name = "weixin_secret_id",columnDefinition="varchar(200) DEFAULT NULL COMMENT '微信SecretId'")
    private String weixinSecretId;

    @Column(name = "weixin_encoding_AESKey",columnDefinition="varchar(200) DEFAULT NULL COMMENT '微信企业号的EncodingAESKey'")
    private String weixinEncodingAESKey;

    @Column(name = "weixin_wechat_token",columnDefinition="varchar(200) DEFAULT NULL COMMENT '微信订阅号token'")
    private String weixinWechatToken;

    @Column(name = "weixin_app_secret",columnDefinition="varchar(200) DEFAULT NULL COMMENT '微信订阅号secret'")
    private String weixinAppSecret;

    @Column(name = "weixin_app_id",columnDefinition="varchar(200) DEFAULT NULL COMMENT '微信订阅号app_id'")
    private String weixinAppId;

}
