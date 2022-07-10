package com.fkp.entity;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

@Data
public class BaseRequest {
    @NotNull(message = "header is not null")
    private RequestHeader header;

    private String sourceAddr = "10658830";

    @NotBlank(message = "destMobiles is not blank")
    private String[] destMobiles;
}
