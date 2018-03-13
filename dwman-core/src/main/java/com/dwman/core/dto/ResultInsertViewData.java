package com.dwman.core.dto;

import lombok.Data;

import java.util.Map;

/**
 * 插入数据返回页面
 */
@Data
public class ResultInsertViewData  extends ResultCommonData{
    //返回插入数据条数
    private Long insertCountData ;

}
