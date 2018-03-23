package com.dwman.entity;

import lombok.Data;

import java.util.Date;

@Data
public class RolePermitEntity {
    private Long id;

    private String roleId;

    private String permitId;

    private String createUser;

    private Date createTime;

    private String remark;
}