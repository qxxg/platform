package com.qxxg.springcloud.platformseataa.result;


public class CommonResult<T> {
    private String code;
    private String message;
    private T data;

    public CommonResult() {
    }

    public CommonResult(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public CommonResult(String code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * 成功返回结果
     *
     * @param data 获取的数据
     */
    public static <T> CommonResult<T> success(T data) {
        return new CommonResult<T>(ResultCode.DEFAULT_RESPONSE_RESULT.getCode(), ResultCode.DEFAULT_RESPONSE_RESULT.getMessage(), data);
    }

    /**
     * 成功返回结果
     *
     * @param data    获取的数据
     * @param message 提示信息
     */
    public static <T> CommonResult<T> success(T data, String message) {
        return new CommonResult<T>(ResultCode.DEFAULT_RESPONSE_RESULT.getCode(), message, data);
    }

    /**
     * 成功返回结果
     *
     * @param message 提示信息
     */
    public static <T> CommonResult<T> success(String message) {
        return new CommonResult<T>(ResultCode.DEFAULT_RESPONSE_RESULT.getCode(), message);
    }

    /**
     * 失败返回结果
     *
     * @param errorCode 错误码
     */
    public static <T> CommonResult<T> failed(IErrorCode errorCode) {
        return new CommonResult<T>(errorCode.getCode(), errorCode.getMessage(), null);
    }

    /**
     * 失败返回结果
     *
     * @param message 提示信息
     */
    public static <T> CommonResult<T> failed(String message) {
        return new CommonResult<T>(ResultCode.SYSTEM_ERROR.getCode(), message, null);
    }

    /**
     * 失败返回结果
     */
    public static <T> CommonResult<T> failed() {
        return failed(ResultCode.SYSTEM_ERROR);
    }

    /**
     * 参数验证失败返回结果
     */
    public static <T> CommonResult<T> validateFailed() {
        return failed(ResultCode.SYSTEM_PARAMETER_ERROR);
    }

    /**
     * 参数验证失败返回结果
     *
     * @param message 提示信息
     */
    public static <T> CommonResult<T> validateFailed(String message) {
        return new CommonResult<T>(ResultCode.SYSTEM_PARAMETER_ERROR.getCode(), message, null);
    }

    /**
     * 未登录返回结果
     */
    public static <T> CommonResult<T> unauthorized(T data) {
        return new CommonResult<T>(ResultCode.SYSTEM_AUTH_NONE.getCode(), ResultCode.SYSTEM_AUTH_NONE.getMessage(), data);
    }

    /**
     * 未授权返回结果
     */
    public static <T> CommonResult<T> forbidden(T data) {
        return new CommonResult<T>(ResultCode.SYSTEM_FORBIDDEN.getCode(), ResultCode.SYSTEM_FORBIDDEN.getMessage(), data);
    }

    /**
     * @param iErrorCode
     * @param <T>
     * @return
     */
    public static <T> CommonResult<T> systemResult(IErrorCode iErrorCode) {
        return new CommonResult<T>(iErrorCode.getCode(), iErrorCode.getMessage());
    }

    /**
     * @param iErrorCode
     * @param message
     * @param <T>
     * @return
     */
    public static <T> CommonResult<T> systemResult(IErrorCode iErrorCode, String message) {
        return new CommonResult<T>(iErrorCode.getCode(), message);
    }

    /**
     * @param iErrorCode
     * @param message
     * @param <T>
     * @return
     */
    public static <T> CommonResult<T> systemResult(IErrorCode iErrorCode, T data, String message) {
        return new CommonResult<T>(iErrorCode.getCode(), message, data);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}