package com.nutanix.maryanto.dimas.training.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MessageError {

    private Integer statusCode;
    private String message;
}
