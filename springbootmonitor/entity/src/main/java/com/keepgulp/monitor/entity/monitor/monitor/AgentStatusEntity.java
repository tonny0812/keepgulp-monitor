package com.keepgulp.monitor.entity.monitor.monitor;

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
public class AgentStatusEntity {
    // 组ID
    private String groupsId;
    // 组名
    private String groupsName;
    // 正常的数量
    private int ok;
    // 失败的数据
    private int faild;
    // 应该有的数量
    private int totle;
}
