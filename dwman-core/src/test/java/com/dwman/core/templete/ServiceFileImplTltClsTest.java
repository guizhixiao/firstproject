package com.dwman.core.templete;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class ServiceFileImplTltClsTest {

    @Test
    public void test() throws Exception {
//        TltType tltType = new TltType();
//        tltType.setTemplateFile("/templete/serviceImpl.templete");
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
        map.put("[package]", "com.dwman.service.impl");
        map.put("[class]", "Admin");
        map.put("[classX]", "admi111n");
        return map;

    }

}