package com.dwman.entity;

import lombok.Data;

import java.util.Date;

@Data
public class PermitHandleEntity{
    private Long id;

    private Long permitId;

    private Long handleId;

    private Date createTime;

    private String createUser;

    private String remark;

 }