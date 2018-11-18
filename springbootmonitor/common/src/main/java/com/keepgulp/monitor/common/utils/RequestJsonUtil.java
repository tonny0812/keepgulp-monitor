package com.keepgulp.monitor.common.utils;

import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.InputStream;

/**
 * 
 * @author zy
 * @Date 2016-06-30
 * 请求body的json转换
 */
@Slf4j
public class RequestJsonUtil {

	private static Gson gson = new Gson();
    private static Object object = new Object();
    
    /**
     * 
     * @param request
     * @param obj
     * @return
     */
	public static <T> Object toObject(HttpServletRequest request, Class<T> obj){
		
		try {
			InputStream is = request.getInputStream();
	        String content = IOUtils.toString(is,"utf-8");
	        object = gson.fromJson(content, obj);
			 return object;
		} catch (IOException e) {
			log.error("ERROR:",e);
		}
	    return obj;
	}
}
