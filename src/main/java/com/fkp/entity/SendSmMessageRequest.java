package com.fkp.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;

@Data
@EqualsAndHashCode(callSuper = true)
public class SendSmMessageRequest extends BaseRequest {

    @NotNull(message = "content is not blank")
    private String content;
}
