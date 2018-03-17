package com.dwman.core.templete;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class ServiceFileTempleteTest {

    @Test
    public void read() {
    }

    @Test
    public void write() {
        System.out.println("write");
    }

    ///////////////////////////////////////////////////////////////////////////
    // 启动程序
    ///////////////////////////////////////////////////////////////////////////

    @Test
    public void test() throws Exception {
        TempleteFileEntity templeteFileEntity = new TempleteFileEntity();
        templeteFileEntity.setTemplateFile("/templete/service.templete");
        templeteFileEntity.setDescFile("aa.java");

        CommonFileTemplete fileTemplete = new CommonFileTemplete(templeteFileEntity, init());
        fileTemplete.createTempleteFile();
    }


    /***
     * 生成Biz的配置属性
     */
    public static Map<String, Object> init() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("[package]", "com.dwman.service");
        map.put("[class]", "Admin");
        return map;

    }
}