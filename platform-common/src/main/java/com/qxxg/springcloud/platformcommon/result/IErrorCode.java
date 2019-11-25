package com.qxxg.springcloud.platformcommon.result;

public interface IErrorCode {
    String getCode();

    String getMessage();

    void setMessage(String message);

    int getStatus();

    void setStatus(int status);
}