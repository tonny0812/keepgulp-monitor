package com.keepgulp.monitor.common.utils.network;

import com.keepgulp.monitor.common.utils.DateUtil;
import com.keepgulp.monitor.entity.resource.ResourceNetworkAddressEntity;

import java.util.ArrayList;

/**
 * 实现ping
 */
public class NetworkPing extends Thread{

//    private CmdbResourceNetworkAddressService service;
    private int networkId;
    private static ArrayList addList;
    private String networkPrefix;


//    public NetworkPing(CmdbResourceNetworkAddressService service, int networkId, ArrayList addList,String networkPrefix){
//        this.service = service;
//        this.networkId = networkId;
//        this.addList = addList;
//        this.networkPrefix = networkPrefix;
//
//    }



//    public void run(){
//        for(int i=1;i<254;i++) {
//            ResourceNetworkAddressEntity entity = new ResourceNetworkAddressEntity();
//            Ping ping = new Ping();
//            int res = ping.execPing(this.networkPrefix + "." +i );
//
//            entity.setIpSubffix(i);
//            entity.setIpPrefixId(networkId);
//            entity.setStatus(res);
//            entity.setLastModifyTime(DateUtil.getTimeStamp());
//            if (addList.contains(this.networkId + "" + i)) {
//                service.update(entity);
//            } else {
//                service.save(entity);
//            }
//
//        }
//        try {
//            super.interrupt();
//        } catch (Exception e) {
//
//        }
//    }


}
