package com.dwman.core.templete;

import com.dwman.core.annonation.TltCls;
import com.dwman.core.utils.FileUtils;
import com.dwman.core.utils.ObjectTransitionUtils;
import com.dwman.core.utils.ProjectUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BatchTlt {

//    public static void main(String[] args) throws Exception {
//        BatchTlt batchTlt = new BatchTlt() ;
//        batchTlt.batch("com.dwman",TltType.DEFAULT_BIZ_TEMPLETE);
//    }

    /***
     * 批量生成文件
     *  在该方法中，系统会循环查找Entity中存在@TltFCls注解的类，查到了，就生成文件。
     * @param parentPackage  包名称（上级包名称）
     * @param templeteType 生成文件的类型
     */
    public void batch(String parentPackage, String templeteType) throws Exception {
        String projectPath = ProjectUtils.codePath();
        String entityPath = projectPath + parentPackage.replace(".", "/") + "/" + "entity/";
        FileUtils fileUtils = new FileUtils();
        List<File> lists = fileUtils.getFilesByPath(entityPath, true, new ArrayList<File>());
        Map<String, Object> map = null;

        for (File fl : lists) {
            map = new HashMap<String, Object>();
            String className = parentPackage + ".entity." + fl.getName().replace(".java", "");
            Class clazz = Class.forName(className);
            Annotation annotation = clazz.getAnnotation(TltCls.class);
            if (annotation != null) {
                TltConfiguration tltConfiguration = new TltConfiguration();
                CreateTlt tlt = new CreateTlt(tltConfiguration, clazz, parentPackage);

                String suffixPackage = projectPath + parentPackage.replace(".", "/") + "/";
                tltConfiguration.setTemplateFile(templeteType);
                if (templeteType.contains(TltType.DEFAULT_BIZ_TEMPLETE)) {
                    tltConfiguration.setDescFile(suffixPackage + "biz" + "/" + tlt.getPrefixClassName() + "Biz.java");
                } else if (templeteType.contains(TltType.DEFAULT_SERVICE_TEMPLETE)) {
                    tltConfiguration.setDescFile(suffixPackage + "service" + "/" + tlt.getPrefixClassName() + "Service.java");
                } else if (templeteType.contains(TltType.DEFAULT_SERVICE_IMPL_TEMPLETE)) {
                    tltConfiguration.setDescFile(suffixPackage + "service" + "/impl/" + tlt.getPrefixClassName() + "ServiceImpl.java");
                } else if (templeteType.contains(TltType.DEFAULT_DAO_TEMPLETE)) {
                    tltConfiguration.setDescFile(suffixPackage + "dao" + "/" + tlt.getPrefixClassName() + "Mapper.java");
                } else if (templeteType.contains(TltType.DEFAULT_DAO_XML_TEMPLETE)) {
                    tltConfiguration.setDescFile(suffixPackage + "dao/impl" + "/" + tlt.getPrefixClassName() + "Mapper.xml");
                }

                tlt.createTempleteFile();
            }
        }
    }

}
