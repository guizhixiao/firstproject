package com.dwman.entity;

import lombok.Data;

import java.util.Date;

@Data
public class PermitEntity {
    private Long id;

    private String permitNo;

    private String permitName;

    private String permitAlias;

    private String permitCode;

    private String permitIntroduction;

    private Integer useFlag;

    private Integer delFlag;

    private String createUser;

    private Date createTime;

    private String remark;
}