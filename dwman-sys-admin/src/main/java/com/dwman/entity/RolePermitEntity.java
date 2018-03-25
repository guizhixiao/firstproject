package com.dwman.entity;

import com.dwman.core.annonation.TltCls;
import com.dwman.core.annonation.TltFld;
import lombok.Data;

import java.util.Date;

@TltCls(table = "sys_role_permit",requestMapping = "/rolePermit",comments = "角色权限表")
@Data
public class RolePermitEntity {
    @TltFld(name = "id",column = "id",commonts = "id")
    private Long id;
    @TltFld(name = "roleId",column = "role_id",commonts = "角色编号")
    private String roleId;
    @TltFld(name = "permitId",column = "permit_id",commonts = "权限编号")
    private String permitId;
    @TltFld(name = "createUser",column = "create_user",commonts = "创建人")
    private String createUser;
    @TltFld(name = "createTime",column = "create_time",commonts = "创建时间")
    private Date createTime;
    @TltFld(name = "remark",column = "remark",commonts = "备注")
    private String remark;
}