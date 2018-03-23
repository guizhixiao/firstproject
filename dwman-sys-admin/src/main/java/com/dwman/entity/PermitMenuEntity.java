package com.dwman.entity;

import lombok.Data;

import java.util.Date;
@Data
public class PermitMenuEntity {
    private Long id;

    private Long permitId;

    private Long menuId;

    private Date createTime;

    private String createUser;

    private String remark;
 }