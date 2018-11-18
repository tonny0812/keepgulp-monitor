package com.keepgulp.monitor.common.utils.weixin;

import com.google.gson.Gson;
import com.keepgulp.monitor.common.utils.HttpUtil;
import com.keepgulp.monitor.entity.monitor.configure.MonitorMessageChannelEntity;
import com.keepgulp.monitor.entity.monitor.monitor.MonitorMessagesEntity;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
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
 */
@Slf4j
public class WeixinUtil {

    private static Gson gson = new Gson();

    /**
     * 企业版获取token
     * @param CorpID
     * @param SecretId
     * @return
     */
    static String  getToken(String CorpID, String SecretId) {
        String url = "http://out.mappings.asura.com/4/qyapi.weixin.qq.com/cgi-bin/gettoken?corpid="+CorpID+"&corpsecret="+SecretId;
        String tokenData ;
        try {
            tokenData = HttpUtil.sendGet(url);
            log.info(tokenData);
        }catch (Exception e){
            log.error(e.toString());
            tokenData = "";
        }
        WeixinEntity weixinEntity = gson.fromJson(tokenData, WeixinEntity.class);
        log.info(gson.toJson(weixinEntity));
        return weixinEntity.getAccess_token();
    }

    /**
     * 发送微信消息
     * @param channelEntity
     * @param monitorMessagesEntity
     */
    public static void sendWeixin(MonitorMessageChannelEntity channelEntity, MonitorMessagesEntity monitorMessagesEntity){
        String token = getToken(channelEntity.getWeixinCorpId(), channelEntity.getWeixinSecretId());
        String sendUrl =  "http://out.mappings.asura.com/5/qyapi.weixin.qq.com/cgi-bin/message/send?access_token="+token;
        WeixinEntity entity = new WeixinEntity();
        entity.setTouser(monitorMessagesEntity.getWeixin().replace(",","|"));
        entity.setMsgtype("text");
        entity.setAccess_token(token);
        entity.setAgentid(channelEntity.getWeixinAppId());
        Map map = new HashMap();
        map.put("content", monitorMessagesEntity.getMessages());
        entity.setText(map);
        log.info(gson.toJson(entity).replace("\\u003e",">"));
        try {
            String result = HttpUtil.httpPostJson(sendUrl, gson.toJson(entity).replace("\\u003e", ">"),"POST");
            log.info(result);
        }catch (Exception e){
            log.error(e.toString());
        }
    }

}
