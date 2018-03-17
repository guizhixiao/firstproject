package com.dwman.core.dto;

import lombok.Data;

/**
 * 删除数据操作
 */
@Data
public class ResultDeleteViewData extends ResultCommonData {
    private Long deleteCount;
}
