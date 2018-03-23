package com.dwman.entity;
import lombok.Data;

@Data
public class DeptRoleEntity{
    private Integer id;

    private Integer deptNo;

    private Integer roleId;

    private String createUser;

    private Integer createTime;

    private String remark;
}