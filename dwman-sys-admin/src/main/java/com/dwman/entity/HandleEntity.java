package com.dwman.entity;

import lombok.Data;

import java.util.Date;

@Data
public class HandleEntity {
    private Long id;

    private Long handleId;

    private String handleName;

    private Integer useFlag;

    private Integer delFlag;

    private Date createTime;

    private String createUser;

    private String remark;

 }