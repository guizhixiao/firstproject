package com.dwman.core.templete;


import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class DaoFileTltClsTest {

    @Test
    public void test() throws Exception {
//        TltType tltType = new TltType();
//        tltType.setTemplateFile("/templete/dao.templete");
//        tltType.setDescFile("aa.java");
//
//        CommonFileTemplete fileTemplete = new CommonFileTemplete(tltType, init());
//        fileTemplete.createTempleteFile();
    }


    /***
     * 生成Biz的配置属性
     */
    public static Map<String, Object> init() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("[package]", "com.dwman.dao");
        map.put("[class]", "Admin");
        return map;

    }

}