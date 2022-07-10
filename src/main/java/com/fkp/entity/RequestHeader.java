package com.fkp.entity;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

@Data
public class RequestHeader {
    @NotBlank(message = "msgId is not blank")
    private String msgId;
    @NotBlank(message = "deviceId is not blank")
    private String deviceId;
    @NotBlank(message = "devicePwd is not blank")
    private String devicePwd;
    @NotBlank(message = "accessPlatformID is not blank")
    private String accessPlatformID;
    private String recvMsgSeq;
    private String needReport;
    private String reserveParam;
}
