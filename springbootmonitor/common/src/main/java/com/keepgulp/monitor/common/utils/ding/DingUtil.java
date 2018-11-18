package com.keepgulp.monitor.common.utils.ding;

import com.google.gson.Gson;
import com.keepgulp.monitor.common.utils.HttpUtil;
import com.keepgulp.monitor.entity.monitor.configure.MonitorMessageChannelEntity;
import com.keepgulp.monitor.entity.monitor.monitor.MonitorMessagesEntity;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 */
@Slf4j
public class DingUtil {

    private static Gson gson = new Gson();

    public static void   sendDingDing(MonitorMessageChannelEntity channelEntity, MonitorMessagesEntity messagesEntity) {
        try {
            DingEntity dingEntity = new DingEntity();
            String tokenUrl = "http://out.mappings.asura.com/2/oapi.dingtalk.com/gettoken?corpid=" + channelEntity.getDingCorpId() + "&corpsecret=" + channelEntity.getDingSecretId();
            String tokenData = HttpUtil.sendGet(tokenUrl);
            DingEntity dingEntity1 = gson.fromJson(tokenData, DingEntity.class);
            String token = dingEntity1.getAccess_token();
            System.out.println(token);
            String sendUrl = "http://out.mappings.asura.com/3/oapi.dingtalk.com/message/send?access_token=" + token;
            dingEntity.setAgentid(channelEntity.getDingAgentId() + "");
            dingEntity.setMsgtype("text");
            dingEntity.setTouser(messagesEntity.getDing());
            dingEntity.setToparty("");
            Map map = new HashMap();
            map.put("content", messagesEntity.getMessages());
            dingEntity.setText(map);
            String result = gson.toJson(dingEntity);
            log.info(result);
            log.info(HttpUtil.httpPostJson(sendUrl, result, "POST"));
        }catch (Exception e){
            log.error(e.toString());
        }
    }


}
