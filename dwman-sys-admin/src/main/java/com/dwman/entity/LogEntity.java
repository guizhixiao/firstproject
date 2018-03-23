package com.dwman.entity;

import lombok.Data;

import java.util.Date;

@Data
public class LogEntity {
    private Long id;

    private String ip;

    private String menuId;

    private String menuName;

    private String operId;

    private String operName;

    private Date createTime;

    private String createUser;

    private String remark;
}