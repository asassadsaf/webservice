package com.fkp.entity;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

@Data
public class BaseResponse {
    @NotBlank(message = "returnCode is not blank")
    private String returnCode;
    private String description;
}
