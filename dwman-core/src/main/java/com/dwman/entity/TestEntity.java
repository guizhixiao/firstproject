package com.dwman.entity;

import com.dwman.core.annonation.TltCls;
import com.dwman.core.annonation.TltFld;
import lombok.Data;

@Data
@TltCls(comments = "这是一个测试类",table = "t_test",requestMapping = "/test")
public class TestEntity {
    @TltFld(value = "valueId",author = "idauthor",name = "idname")
    private String id ;
    @TltFld(value = "valuename",author = "idnameauthor",name = "namename")
    private String name ;
}
