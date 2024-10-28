package com.gjy.spring.interceptors;

import java.lang.annotation.*;

/**
 * 自定义注解-用户登录态校验
 *
 */

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Authentication {
}
