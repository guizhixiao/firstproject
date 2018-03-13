package com.dwman.core.dto;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * 统计数据量
 *
 */
@Data
public class ResultTotalViewData  extends ResultCommonData{

    //总数据量
    private Long totalSize ;
    //总页数
    private Long totalPage ;
    //当前页
    private Long current ;
    //每页数据量
    private Long size ;
}
