package com.fkp.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.validator.constraints.NotBlank;


@Data
@EqualsAndHashCode(callSuper = true)
public class SendSmTplMessageRequest extends BaseRequest {

    @NotBlank(message = "templetId is not blank")
    private String templetId;

    @NotBlank(message = "tplVars is not blank")
    private String[] tplVars;

}
