package com.keepgulp.monitor.entity.resource;

import lombok.Data;

import java.util.Date;

/**
 * <p></p>
 * <p/>
 * <PRE>
 * <BR>
 * <BR>-----------------------------------------------
 * <BR>
 * </PRE>
 *
 * @author zhaozq14
 * @version 1.0
 * @date 2016-07-28 11:31:36
 * @since 1.0
 */
@Data
public class CmdbResourceGroupsEntity {

    private String lastModifyTime;

    private Integer groupsId;

    private String groupsName;

    private Date createTime;

    private String createUser;

    private String lastModifyUser;

}
