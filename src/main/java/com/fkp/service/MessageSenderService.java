package com.fkp.service;

import com.fkp.entity.SendSmMessageRequest;
import com.fkp.entity.SendSmMessageResp;
import com.fkp.entity.SendSmTplMessageRequest;
import com.fkp.entity.SendSmTplMessageResp;

import javax.jws.WebService;

@WebService
public interface MessageSenderService {
    SendSmMessageResp sendSmMessage(SendSmMessageRequest sendSmMessageRequest);

    SendSmTplMessageResp sendSmTplMessage(SendSmTplMessageRequest sendSmTplMessageRequest);
}
