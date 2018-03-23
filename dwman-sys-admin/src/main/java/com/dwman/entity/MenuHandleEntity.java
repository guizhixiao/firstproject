package com.dwman.entity;

import lombok.Data;

import java.util.Date;

@Data
public class MenuHandleEntity {
    private Long id;

    private Long menuId;

    private Long handleId;

    private Date createTime;

    private String createUser;

    private String remark;

  }