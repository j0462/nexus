package com.sparta.nexusteam.base;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CommonResponse {
    private int statusCode;
    private String message;
    private Object data;
    
}
