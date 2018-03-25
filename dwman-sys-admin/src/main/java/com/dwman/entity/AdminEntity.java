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
    @TltFld(name = "age",value = "年龄",column = "name",commonts = "年龄")
    private String age;
    @TltFld(name = "phone",value = "手机号码",commonts = "手机号码",column = "phone")
    private String phone;
    @TltFld(name = "address",value = "地址",commonts = "地址",column = "address")
    private String address;
    @TltFld(name = "email",value = "email",commonts = "email",column = "email")
    private String email;
    @TltFld(name = "qq",value = "qq",commonts = "qq",column = "qq")
    private String qq;
    @TltFld(name = "createTime",value = "创建时间",commonts = "创建时间",column = "create_time")
    private String createTime;
    @TltFld(name = "createUser",value = "创建人",commonts = "创建人",column = "create_user")
    private String createUser;
    @TltFld(name = "remark",value = "备注",commonts = "备注",column = "remark")
    private String remark;
    @TltFld(name = "useFlag",value = "是否使用",commonts = "是否使用",column = "use_flag")
    private String useFlag;
    @TltFld(name = "delFlag",value = "是否删除",commonts = "是否删除",column = "del_flag")
    private String delFlag;
}