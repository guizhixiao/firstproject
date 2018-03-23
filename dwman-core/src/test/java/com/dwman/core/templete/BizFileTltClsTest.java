package com.dwman.core.templete;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class BizFileTltClsTest {

    @Test
    public void read() {

//        ObjectTransitionUtils.capitalize();
    }

    @Test
    public void write() {
    }

    ///////////////////////////////////////////////////////////////////////////
    // 启动程序
    ///////////////////////////////////////////////////////////////////////////

    @Test
    public void main() throws Exception {
//        TltType tltType = new TltType();
//        tltType.setTemplateFile("/templete/biz.templete");
//        tltType.setDescFile("aa.java");
//
//        CommonFileTemplete fileTemplete = new CommonFileTemplete(tltType, init()) {
//        };
//        fileTemplete.createTempleteFile();
    }


    /***
     * 生成Biz的配置属性
     */
    public static Map<String, Object> init() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("[package]", "com.dwman.biz");
        map.put("[class]", "Admin");
        map.put("[classComment]", "用户管理系统");
        map.put("[rootRequestMapping]", "/admin");
        return map;
    }


}