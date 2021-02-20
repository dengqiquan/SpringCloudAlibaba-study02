package com.study.xinchao.domain.dto;

import com.study.xinchao.annotation.PhoneValidate;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @description:
 * @author: Deng Qi Qua_n
 * @date: 2021/1/26 11:08
 */
@Data
public class UserDto {

    @NotNull(message = "用户名不能为空")
    private String username;

    private String password;

    @PhoneValidate(message = "请输入正确格式手机号")
    private String phone;

    private Integer age;

    private Long id;
}
