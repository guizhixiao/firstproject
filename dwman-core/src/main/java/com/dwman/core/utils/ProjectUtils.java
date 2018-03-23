package com.dwman.core.utils;

import java.net.URL;

/**
 * 项目配置信息
 */
public class ProjectUtils {
    private static final String ROOT_PATH = ".";
    public static final String TARGET_CLASSES = "target/classes/";
    public static final String SRC_MAIN_JAVA ="src/main/java/";

    /**
     * 得到项目路径
     * @return
     */
    public static String projectRootPath() {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        URL url = classLoader.getResource(ROOT_PATH);
        return  url.getPath().replace(TARGET_CLASSES,"")  ;
    }

    /**
     * 得到代码存放路径
     * @return
     */
    public static String codePath(){
        String  srcJava = projectRootPath()+SRC_MAIN_JAVA;
        return srcJava ;
    }

}
