package com.dwman.templete;

import com.dwman.core.templete.CommonFileTemplete;
import com.dwman.core.templete.TempleteFileEntity;
import com.dwman.entity.DeptEntity;

import java.util.HashMap;
import java.util.Map;

/**
 * 生成代码
 */
public class CreateMapperCode {

    public static void main(String[] args) throws Exception {
        CreateMapperCode createBizCode = new CreateMapperCode() ;
        createBizCode.createBizCode();
    }

    /**
     * 生成Biz代码
     */
    public void createBizCode() throws Exception {
        TempleteFileEntity templeteFileEntity = new TempleteFileEntity() ;
        templeteFileEntity.setTemplateFile(TempleteFileEntity.DEFAULT_DAO_TEMPLETE);
        templeteFileEntity.setDescFile("/Users/gaoya/apps/firstproject/dwman-sys-admin/src/main/java/com/dwman/dao/DeptMapper.java");
        CommonFileTemplete commonFileTemplete = new CommonFileTemplete(templeteFileEntity,initBizMap());
        commonFileTemplete.createTempleteFile();
    }

    public Map<String,Object> initBizMap() {
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("[package]","com.dwman.dao");
        map.put("[class]","Dept");
        map.put("[params]",new DeptEntity());
        return map;

    }


}
