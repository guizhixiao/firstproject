package com.dwman.entity;

import lombok.Data;

import java.util.Date;

@Data
public class AdminRoleEntity {
    private String id;

    private String userId;

    private String roleId;

    private String createUser;

    private String createTime;

    private String remark;
}