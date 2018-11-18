/**
 * @FileName: SearchCondition.java
 * @Package com.asura.framework.paging
 * 
 * @author zhangshaobin
 * @created 2012-12-12 下午7:33:30
 * 
 * Copyright 2011-2015 Asura
 */
package com.keepgulp.monitor.common.framework.base.paging;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>查询条件</p>
 * 
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 * 
 * @author zhangshaobin
 * @since 1.0
 * @version 1.0
 */
@Data
public class SearchCondition implements Serializable {
	
	private static final long serialVersionUID = -5789621926212852167L;

	/**
	 * 参数名称
	 */
	private String name;

	/**
	 * 参数比较类型
	 */
	private int operateType;

	/**
	 * 参数值
	 */
	private Object value;

}
