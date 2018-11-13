package com.keepgulp.monitor.entity.common;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class RedisEntity {

	private String url;

	private String app;

	private int port;

}
