package com.fkp.ws;

import com.fkp.entity.RequestHeader;
import com.fkp.entity.SendSmTplMessageRequest;
import com.fkp.entity.SendSmTplMessageResp;
import com.fkp.service.MessageSenderService;
import com.fkp.utils.CryptoUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

@Slf4j
public class Test {

    private static final AtomicInteger atomicInteger = new AtomicInteger();
    static SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");

    public static RequestHeader getRequestHeader() {
        RequestHeader requestHeader = new RequestHeader();
        requestHeader.setAccessPlatformID("100");
        requestHeader.setDeviceId("2030");
        int index = atomicInteger.getAndIncrement();
        if(index == 99999999){
            atomicInteger.set(0);
        }
        String msgId = requestHeader.getDeviceId() + requestHeader.getAccessPlatformID() + sdf.format(new Date()) + String.format("%08d",index);
        requestHeader.setMsgId(msgId);
        requestHeader.setDevicePwd(msgId + CryptoUtil.getMD5String("push@2030"));
        return requestHeader;
    }

    public static void main(String[] args) {
        SendSmTplMessageRequest request = new SendSmTplMessageRequest();
        request.setHeader(getRequestHeader());
        request.setDestMobiles(new String[]{"15662735045"});
        request.setTempletId("20300001");
        request.setTplVars(new String[]{"对10.0.143.98服务器下/opt/testdir目录进行加密}","123456"});
        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
        factoryBean.setAddress("http://218.200.229.221:8090/umap-pm-ws/services/MessageSender");
        factoryBean.setServiceClass(MessageSenderService.class);
        MessageSenderService service = factoryBean.create(MessageSenderService.class);
        log.info("request:{}",request);
        SendSmTplMessageResp response = service.sendSmTplMessage(request);
        log.info("response:{}",response);
    }
}
