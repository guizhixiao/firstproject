package com.dwman.entity;

import lombok.Data;

@Data
public class DeptEntity {
    private String id="id";

    private String deptNo="单位编号";

    private String deptName="单位名称";

    private String rangeRank="使用范围";

    private String useFlag="是否使用";

    private String createUser="创建人";

    private String createTime="创建时间";

    private String remark="备注";
}