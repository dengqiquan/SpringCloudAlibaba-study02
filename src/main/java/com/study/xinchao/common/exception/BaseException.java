package com.study.xinchao.common.exception;

import com.study.xinchao.common.enums.ResultCodeEnum;
import org.slf4j.helpers.MessageFormatter;

import java.io.Serializable;

/**
 * @description:自定义异常类
 * @author: Deng Qi Qua_n
 * @date: 2021/1/27 18:02
 */
public class BaseException extends RuntimeException implements Serializable {
    int code;

    public BaseException() {
    }

    public BaseException(String msg) {
        super(msg);
        this.code = ResultCodeEnum.FAIL.getCode();
    }

    public BaseException(int code, String msg) {
        super(msg);
        this.code = code;
    }

    public BaseException(int code, String msg, Exception ex) {
        super(msg, ex);
        this.code = code;
    }

    public BaseException(ResultCodeEnum resultCode) {
        super(resultCode.getMsg());
        this.code = resultCode.getCode();
    }

    public BaseException(ResultCodeEnum resultCode, String msg) {
        super(msg);
        this.code = resultCode.getCode();
    }

    public BaseException(int code, String format, Object... arguments) {
        super(MessageFormatter.arrayFormat(format, arguments).getMessage());
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(final int code) {
        this.code = code;
    }
}
