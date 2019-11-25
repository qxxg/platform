package com.qxxg.springcloud.platformgateway.util;


public enum ResultCode implements IErrorCode {
    DEFAULT_RESPONSE_RESULT("00000", "操作成功"),
    SYSTEM_ERROR("10001", "系统错误"),
    SYSTEM_PAUSE("10002", "服务暂停"),
    SYSTEM_AUTH_NONE("10003", "该请求需要授权"),
    SYSTEM_TASK_BUSY("10004", "任务过多,系统繁忙"),
    SYSTEM_TASK_TIMEOUT("10005", "任务过多,系统超时"),
    SYSTEM_TIMEOUT("502", "网络延时，请从新再试"),
    SYSTEM_PARAMETER_REQUIRE("10006", "缺失必选的参数"),
    SYSTEM_PARAMETER_VALUE_ILLEGAL("10007", "参数值非法"),
    SYSTEM_PARAMETER_ERROR("10008", "参数错误"),
    SYSTEM_MAIL_ERROR("10009", "EMAIL发送失败"),
    SYSTEM_SMS_ERROR("10010", "短信发送失败"),
    SYSTEM_DEVICE_ERROR("10011", "您的账号已在其他地方登陆"),
    SYSTEM_FORBIDDEN("10012", "不允许访问"),

    USER_EXIST_ERROR("20001", "当前手机号已被注册"),
    USER_AUTHCODE_VERIFY_ERROR("20002", "验证码不正确"),
    USER_PASSWD_ERROR("20003", "密码不正确"),
    USER_ACCOUNT_EXCEPTION("20004", "您的账号异常，请联系供应商"),
    USER_ACCOUNT_EXPIRED("20005", "您的账号已到期，请联系供应商"),
    USER_ACCOUNT_PASSWD_ERROR("20006", "用户名或密码错误"),
    USER_ACCOUNT_NOTEXIST_ERROR("20007", "用户不存在");;

    private String code;
    private String message;
    private int status;

    ResultCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}