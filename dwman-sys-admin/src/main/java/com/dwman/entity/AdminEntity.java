package com.dwman.entity;

import com.dwman.core.annonation.TltCls;
import com.dwman.core.annonation.TltFld;
import lombok.Data;

import java.util.Date;

@TltCls(name = "Admin",requestMapping = "admin",author = "gss",comments = "系统用户表",table = "sys_admin")
@Data
public class AdminEntity  {
    @TltFld(name = "id",value = "id",column = "id",commonts = "id")
    private String id;
    @TltFld(name = "name",value = "姓名",commonts = "姓名",column = "name")
    private String name;

    private String age;

    private String phone;

    private String address;

    private String email;

    private String qq;

    private String createTime;

    private String createUser;

    private String remark;

    private String useFlag;

    private String delFlag;
}