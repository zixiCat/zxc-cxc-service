package com.zxc.cxc.common;

import lombok.Data;

@Data
public class OpenAPIResponse<T> {
    private Integer code;
    private String message;
    private T data;

    public OpenAPIResponse(ResponseCode responseCode, T data) {
        this.code = responseCode.getCode();
        this.message = responseCode.getMessage();
        this.data = data;
    }

    public static <T> OpenAPIResponse<T> ok(T data) {
        return new OpenAPIResponse<>(ResponseCode.SUCCESS, data);
    }

    public static <T> OpenAPIResponse<T> fail(ResponseCode responseCode, T data) {
        return new OpenAPIResponse<>(responseCode, data);
    }
}
