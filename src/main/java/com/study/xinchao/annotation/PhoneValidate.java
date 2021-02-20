package com.study.xinchao.annotation;

import org.apache.commons.lang.StringUtils;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Payload;
import java.lang.annotation.*;
import java.util.regex.Pattern;

/**
 * @author XC17335
 */
@Documented
@Constraint(validatedBy = PhoneValidate.PhoneCheck.class)
@Target({ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PhoneValidate {

    String message() default "手机号格式不正确";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};


    class PhoneCheck implements ConstraintValidator<PhoneValidate, String> {
        @Override
        public boolean isValid(String phone, ConstraintValidatorContext constraintValidatorContext) {
            // 不验证空值
            if (StringUtils.isEmpty(phone)) {
                return true;
            }
            // 参数不是空，对 手机号格式进行校验
            return isPhone(phone);
        }

        @Override
        public void initialize(PhoneValidate constraintAnnotation) {

        }
        /** 验证是否为手机号
         */
        public static boolean isPhone (String phone){
            String pattern  = "^(13[0-9]|14[579]|15[0-3,5-9]|16[6]|17[0135678]|18[0-9]|19[89])\\d{8}$";
            if (Pattern.matches(pattern, phone)) {
                return true;
            }else{
                return false;
            }
        }
    }

}
