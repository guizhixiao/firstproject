package com.dwman.core.entity;

import lombok.Data;

import java.io.Serializable;
import java.text.SimpleDateFormat;

/**
 * 核心
 */
@Data
public class BaseEntity implements Serializable {
//    创建人
    private String createUser ;
//    创建时间
    private String createTime;
//    修改时间
    private String updateTime ;
//    备注
    private String remark ;

}
