package com.dwman.core.templete;

import lombok.Data;

/**
 * 模板文件属性的配置
 */
@Data
public class TltConfiguration {
    //模板文件名称
    private String templateFile;
    //生成的文件名称
    private String descFile;

    // annotation 忽略的方法
    public final static String ANNOTATION_IGNORE_METHOD_EQUALS="equals";
    public final static String ANNOTATION_IGNORE_METHOD_HASHCODE="hashCode";
    public final static String ANNOTATION_IGNORE_METHOD_ANNOTATIONTYPE="annotationType";
    public final static String ANNOTATION_IGNORE_METHOD_TOSTRNG="toString";

    // for 循环开始的语句
    public static final String TEMPLETE_FOR_INSTRUCT = "[for]";
    // for 循环结束的语句
    public static final String END_TEMPLETE_FOR_INSTRUCT = "[/for]";

    // 实体类对象后缀 名称
    public final static String ENTITY_POSTFIX="Entity" ;
    //拆分的标志
    public final static String SPLIT_FLAG="###";
    //空字符
    public static final String EMPTY_STR="";

}
