package com.dwman.entity;

import java.util.Date;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPermitNo() {
        return permitNo;
    }

    public void setPermitNo(String permitNo) {
        this.permitNo = permitNo == null ? null : permitNo.trim();
    }

    public String getPermitName() {
        return permitName;
    }

    public void setPermitName(String permitName) {
        this.permitName = permitName == null ? null : permitName.trim();
    }

    public String getPermitAlias() {
        return permitAlias;
    }

    public void setPermitAlias(String permitAlias) {
        this.permitAlias = permitAlias == null ? null : permitAlias.trim();
    }

    public String getPermitCode() {
        return permitCode;
    }

    public void setPermitCode(String permitCode) {
        this.permitCode = permitCode == null ? null : permitCode.trim();
    }

    public String getPermitIntroduction() {
        return permitIntroduction;
    }

    public void setPermitIntroduction(String permitIntroduction) {
        this.permitIntroduction = permitIntroduction == null ? null : permitIntroduction.trim();
    }

    public Integer getUseFlag() {
        return useFlag;
    }

    public void setUseFlag(Integer useFlag) {
        this.useFlag = useFlag;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}