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
 * @date 2016-07-28 11:30:55
 * @since 1.0
 */
@Data
public class CmdbResourceEntnameEntity {

    private String lastModifyTime;

    private Integer entId;

    private String entName;


    private Date createTime;


    private String createUser;


    private String lastModifyUser;

}
