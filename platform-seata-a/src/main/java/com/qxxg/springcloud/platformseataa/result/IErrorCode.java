package com.qxxg.springcloud.platformseataa.result;

public interface IErrorCode {
    String getCode();

    String getMessage();

    void setMessage(String message);

    int getStatus();

    void setStatus(int status);
}