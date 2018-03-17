package com.dwman.core.dto;

import lombok.Data;

import java.util.Map;

/**
 * 通用的返回结果属性
 */
@Data
public class ResultCommonData {
    //类名称
    private String className;
    //方法名称
    private String methodName;
    //状态码
    private String stateCode;
    //状态值
    private String stateName;
    //返回时间
    private String resultTime;

}
