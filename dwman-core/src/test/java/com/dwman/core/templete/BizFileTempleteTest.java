package com.dwman.core.templete;

import com.dwman.entity.AdminExtendsEntity;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class BizFileTempleteTest {

    @Test
    public void read() {

//        StringUtils.capitalize();
    }

    @Test
    public void write() {
    }

    ///////////////////////////////////////////////////////////////////////////
    // 启动程序
    ///////////////////////////////////////////////////////////////////////////

    @Test
    public void main() throws Exception {
        TempleteFileEntity templeteFileEntity = new TempleteFileEntity();
        templeteFileEntity.setTemplateFile("/templete/biz.templete");
        templeteFileEntity.setDescFile("aa.java");

        CommonFileTemplete fileTemplete = new CommonFileTemplete(templeteFileEntity, init()) {
        };
        fileTemplete.createTempleteFile();
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
        // 1.种使用方式
//        String[] res =new String[]{"12","313"};
//        map.put("[params]", Arrays.asList(res));
        // 2.种使用方式
        map.put("[params]", new AdminExtendsEntity());
        //  3.种使用方式
        //        List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
        //        Map<String,Object> inMap = null ;
        //        for (int i=0 ;i<10 ;i++) {
        //            inMap=new HashMap<String, Object>();
        //            inMap.put("[name]", "name"+i);
        //            inMap.put("[value]", "123"+i);
        //            System.out.println(inMap);
        //            list.add(inMap);
        //        }
        //        map.put("[params]",list);
        return map;

    }


}