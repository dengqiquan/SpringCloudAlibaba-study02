package com.study.xinchao.common.enums;

/**
 * @author XC17335
 */

public enum ResultCodeEnum {

    success(200,"操作成功"),
    FAIL(500,"操作失败")
    ;
    private Integer code;

    private String msg;

    ResultCodeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
