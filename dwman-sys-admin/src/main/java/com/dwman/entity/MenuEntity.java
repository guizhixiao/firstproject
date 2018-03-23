package com.dwman.entity;

import lombok.Data;

import java.util.Date;

@Data
public class MenuEntity {
    private Long id;

    private Long menuId;

    private String menuName;

    private String menuUrl;

    private Integer useFlag;

    private Integer delFlag;

    private String parentId;

    private Integer isparent;

    private String createUser;

    private String remark;

    private Date createTime;
}