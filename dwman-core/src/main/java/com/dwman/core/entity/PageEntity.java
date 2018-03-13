package com.dwman.core.entity;

import lombok.Data;

/**
 * page 设置
 *
 */
@Data
public class PageEntity {
    private Long current = 1L ;
    private Long size = 10L ;
}
