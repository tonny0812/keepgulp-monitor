package com.keepgulp.monitor.common.utils.email;

import lombok.Data;

/**
 * <p></p>
 *
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 *
 * @author zhaozq
 * @version 1.0
 * @since 1.0
 */

@Data
public class MailEntity {
    public static final String ENCODEING = "UTF-8";

    private String host; // 服务器地址

    private String sender; // 发件人的邮箱

    private String receiver; // 收件人的邮箱

    private String name; // 发件人昵称

    private String username; // 账号

    private String password; // 密码

    private String subject; // 主题

    private String message; // 信息(支持HTML)

    private String cc; // 抄送人

    private boolean auth; // 是否开启密码验证

}
