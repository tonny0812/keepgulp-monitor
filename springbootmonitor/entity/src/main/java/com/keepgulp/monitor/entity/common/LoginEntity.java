package com.keepgulp.monitor.entity.common;



import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * 登陆放的redis session里面的数据
 */

@Data
public class LoginEntity {

	private String username;
	private String loginTime;
	private String loginIp;
	private String realName;
	private Map  userMap = new HashMap();

}


