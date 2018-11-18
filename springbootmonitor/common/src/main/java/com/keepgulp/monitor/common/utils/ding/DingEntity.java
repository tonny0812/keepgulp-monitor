package com.keepgulp.monitor.common.utils.ding;

import lombok.Data;

import java.util.Map;

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
 * 钉钉配置
 */

@Data
public class DingEntity {

    private String touser;
    private String msgtype;
    private String agentid;
    private String toparty;
    private Map text;
    private String access_token;

}
