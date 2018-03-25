package com.dwman.entity;

import com.dwman.core.annonation.TltCls;
import com.dwman.core.annonation.TltFld;
import lombok.Data;

import java.util.Date;

@TltCls(table = "sys_role",comments = "角色管理",requestMapping = "/role")
@Data
public class RoleEntity{
    @TltFld(name = "id",column = "id",commonts = "id")
    private Long id;
    @TltFld(name = "roleNo",column = "role_no",commonts = "角色编号")
    private String roleNo;
    @TltFld(name = "roleName",column = "role_name",commonts = "角色名称")
    private String roleName;
    @TltFld(name = "roleAlias",column = "role_alias",commonts = "角色别名")
    private String roleAlias;
    @TltFld(name = "roleCode",column = "role_code",commonts = "角色Code")
    private String roleCode;
    @TltFld(name = "roleIntroduction",column = "role_introduction",commonts = "角色介绍")
    private String roleIntroduction;
    @TltFld(name = "useFlag",column = "use_flag",commonts = "是否使用")
    private Integer useFlag;
    @TltFld(name = "delFlag",column = "del_flag",commonts = "是否删除")
    private Integer delFlag;
    @TltFld(name = "createUser",column = "create_user",commonts = "创建时间")
    private String createUser;
    @TltFld(name = "createTime",column = "create_time",commonts = "创建时间")
    private Date createTime;
    @TltFld(name = "remark",column = "remark",commonts = "备注")
    private String remark;
}