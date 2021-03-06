package com.study.spring.annotation;

import java.lang.annotation.*;

/**
 * @author Liuyongzhi
 * @description: 自定义日志注解
 * @date 2019/10/31 0031
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Documented
public @interface HandleResult {

    String desc() default "create17";

}
