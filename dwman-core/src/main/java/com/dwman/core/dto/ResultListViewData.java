package com.dwman.core.dto;

import com.dwman.core.entity.BaseEntity;
import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 *  返回集合数据
 */
@Data
public class ResultListViewData  extends ResultCommonData {
    //总数据量
    private Long totalSize ;
    //总页数
    private Long totalPage ;
    //当前页
    private Long current ;
    //每页数据量
    private Long size ;
    //是否存在前置页面
    private boolean isPrePage = true ;
    //是否存在后置页面
    private boolean isNextPage = true ;
    //页面数据
    private List<Map<String,Object>> data ;
}
