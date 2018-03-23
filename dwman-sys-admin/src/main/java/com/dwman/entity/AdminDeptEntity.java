package com.dwman.entity;

import com.dwman.core.annonation.TltCls;
import com.dwman.core.annonation.TltFld;
import lombok.Data;

@Data
@TltCls(value = "AdminDept" ,table = "sys_admin" ,name = "AdminDept" ,author = "gss",requestMapping = "/adminDept" ,comments = "用户单位模块")
public class AdminDeptEntity {
    @TltFld(value = "编号" ,name = "id",author = "gss",commonts = "编号",column = "id")
    private String id ;
    @TltFld(value = "用户编号" ,name = "userId",author = "gss",commonts = "用户编号",column = "user_id")
    private String userId;
    @TltFld(value = "单位编号" ,name = "deptId",author = "gss",commonts = "单位编号",column = "dept_id")
    private String deptId;
    @TltFld(value = "创建人" ,name = "createUser",author = "gss",commonts = "创建人",column = "create_user")
    private String createUser;
    @TltFld(value = "创建时间" ,name = "createTime",author = "gss",commonts = "创建时间",column = "create_time")
    private String createTime;
    @TltFld(value = "备注" ,name = "remark",author = "gss",commonts = "备注",column = "remark")
    private String remark;

 }