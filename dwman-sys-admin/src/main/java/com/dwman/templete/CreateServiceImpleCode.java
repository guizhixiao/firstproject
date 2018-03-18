package com.dwman.templete;

import com.dwman.core.templete.CommonFileTemplete;
import com.dwman.core.templete.TempleteFileEntity;
import com.dwman.entity.DeptEntity;

import java.util.HashMap;
import java.util.Map;

public class CreateServiceImpleCode {
    public static void main(String[] args) throws Exception {
        CreateServiceImpleCode createBizCode = new CreateServiceImpleCode() ;
        createBizCode.createBizCode();
    }

    /**
     * 生成Biz代码
     */
    public void createBizCode() throws Exception {
        TempleteFileEntity templeteFileEntity = new TempleteFileEntity() ;
        templeteFileEntity.setTemplateFile(TempleteFileEntity.DEFAULT_SERVICE_IMPL_TEMPLETE);
        templeteFileEntity.setDescFile("/Users/gaoya/apps/firstproject/dwman-sys-admin/src/main/java/com/dwman/service/impl/DeptServiceImpl.java");
        CommonFileTemplete commonFileTemplete = new CommonFileTemplete(templeteFileEntity,initBizMap());
        commonFileTemplete.createTempleteFile();
    }

    public Map<String,Object> initBizMap() {
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("[package]","com.dwman.service.impl");
        map.put("[class]","Dept");
        map.put("[rootRequestMapping]","/dept");
        map.put("[classComment]","单位信息管理");
        map.put("[params]",new DeptEntity());
        return map;

    }
}
