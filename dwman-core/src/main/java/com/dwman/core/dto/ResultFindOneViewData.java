package com.dwman.core.dto;

import lombok.Data;

import java.util.Map;

/**
 * 数据操作类
 */
@Data
public class ResultFindOneViewData extends ResultCommonData {

    //返回数据
    private Map<String, Object> data;

}
