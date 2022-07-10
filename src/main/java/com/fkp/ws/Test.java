package com.fkp.ws;

import com.fkp.entity.SendSmTplMessageRequest;
import com.fkp.entity.SendSmTplMessageResp;
import com.fkp.service.MessageSenderService;
import lombok.extern.slf4j.Slf4j;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

@Slf4j
public class Test {
    public static void main(String[] args) {
        SendSmTplMessageRequest request = new SendSmTplMessageRequest();
        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
        factoryBean.setAddress("http://218.200.239.42:8090/umap-pm-ws/services/MessageSender");
        factoryBean.setServiceClass(MessageSenderService.class);
        MessageSenderService service = factoryBean.create(MessageSenderService.class);
        log.info("request:{}",request);
        SendSmTplMessageResp response = service.sendSmTplMessage(request);
        log.info("response:{}",response);
    }
}
