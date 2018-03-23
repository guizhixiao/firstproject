package com.dwman.core.annonation;

import java.lang.annotation.*;

/**
 *  模板类上使用的注解
 */
@Target({ElementType.TYPE})
@Documented//说明该注解将被包含在javadoc中
@Retention(RetentionPolicy.RUNTIME)  // 注解会在class字节码文件中存在，在运行时可以通过反射获取到
public @interface TltCls {
    String value() default "";
    String name() default "";
    String author() default  "" ;   //
    String requestMapping() default ""; //映射地址
    String comments() default "";     //备注信息
    String table() default "";    //表名称
    String date() default "" ;         //时间
}
