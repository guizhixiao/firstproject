package com.dwman.core.templete;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class ServiceFileImplTempleteTest {

    @Test
    public void test() throws Exception {
        TempleteFileEntity templeteFileEntity = new TempleteFileEntity();
        templeteFileEntity.setTemplateFile("/templete/serviceImpl.templete");
        templeteFileEntity.setDescFile("aa.java");

        CommonFileTemplete fileTemplete = new CommonFileTemplete(templeteFileEntity, init());
        fileTemplete.createTempleteFile();
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