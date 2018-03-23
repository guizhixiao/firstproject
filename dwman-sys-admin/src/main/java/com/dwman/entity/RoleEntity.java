package com.dwman.entity;

import lombok.Data;

import java.util.Date;

@Data
public class RoleEntity{
    private Long id;

    private String roleNo;

    private String roleName;

    private String roleAlias;

    private String roleCode;

    private String roleIntroduction;

    private Integer useFlag;

    private Integer delFlag;

    private String createUser;

    private Date createTime;

    private String remark;
}