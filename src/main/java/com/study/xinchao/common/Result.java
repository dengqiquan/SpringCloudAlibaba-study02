package com.study.xinchao.common;


import com.study.xinchao.common.enums.ResultCodeEnum;

/**
 * @description: 统一返回对象封装
 * @author: Deng Qi Qua_n
 * @date: 2021/1/26 10:46
 */
public class Result<T> {

    private T data;

    private Integer code;

    private String msg;

    public Result(T data, Integer code, String msg) {
        this.data = data;
        this.code = code;
        this.msg = msg;
    }

    public Result() {
    }

    public static<T> Result<T> success(T data){
        return new Result<>(data, ResultCodeEnum.success.getCode(),ResultCodeEnum.success.getMsg());
    }
    public static<T> Result<T> success(){
        return new Result<>(null, ResultCodeEnum.success.getCode(),ResultCodeEnum.success.getMsg());
    }

    public Result(T data, Integer code) {
        this.data = data;
        this.code = code;
    }

    public Result(T data,String msg) {
        this.data = data;
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
