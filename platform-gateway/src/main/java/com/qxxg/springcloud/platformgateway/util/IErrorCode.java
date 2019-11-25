package com.qxxg.springcloud.platformgateway.util;

public interface IErrorCode {
    String getCode();

    String getMessage();

    void setMessage(String message);

    int getStatus();

    void setStatus(int status);
}