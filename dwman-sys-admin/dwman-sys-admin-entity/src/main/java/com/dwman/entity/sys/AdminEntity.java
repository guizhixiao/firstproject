package com.dwman.entity.sys;

import lombok.Data;

import java.util.Date;
@Data
public class AdminEntity {
    private Long id;

    private String name;

    private String age;

    private String phone;

    private String address;

    private String email;

    private String qq;

    private Date createTime;

    private String createUser;

    private String remark;

    private Integer useFlag;

    private Integer delFlag;

}