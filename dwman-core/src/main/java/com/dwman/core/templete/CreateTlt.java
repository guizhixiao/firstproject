package com.dwman.core.templete;

import com.dwman.core.annonation.TltCls;
import com.dwman.core.annonation.TltFld;
import com.dwman.core.utils.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;
import java.util.logging.Logger;

/**
 * 生成模板文件
 * 文件类型
 * 文件保存路径
 * 文件名称
 */
public class CreateTlt {
    //日志
    Logger logger = Logger.getLogger(CreateTlt.class.getName());
    //系统中处理的数据类型
    private TltConfiguration tltConfiguration;
    private InputStream inputStream;
    //需要替换的数据参数
    private Map<String, Object> data;
    // 包名称
    private String packageName = "";       //保存的包的名称
    private StringBuffer sb = new StringBuffer();
    public Class clazz;

    /**
     * 提供保存文件的相关配置
     * 统计需要处理的entity
     *
     * @param tltConfiguration 配置属性
     * @param clazz  需要生成文件的实体类对象
     * @param packageName 包名称
     */
    public CreateTlt(TltConfiguration tltConfiguration, Class clazz, String packageName) {
        this.tltConfiguration = tltConfiguration;
        this.packageName = packageName;
        this.clazz = clazz;
        initMap(clazz);
    }

    /**
     * 得到需要生成的文件的开头
     * 比如我们需要生成AdminBiz,我们的基础Entity是AdminEntity ,则该方法会返回Admin
     * @return
     */
    public Object getPrefixClassName() {
        return data.get("[class]");
    }

    /**
     * 初始化系统需要使用的参数。
     */
    private void initMap(Class clazz) {
        data = new HashMap<>();

        Annotation annotation = clazz.getAnnotation(TltCls.class);
        if (annotation != null) {
            TltCls tltCls = (TltCls) annotation;
            data.put("[package]", packageName);
            String simpleName = clazz.getSimpleName().replace(TltConfiguration.ENTITY_POSTFIX, TltConfiguration.EMPTY_STR) ;
            data.put("[class]",simpleName );
            data.put("[classX]",StringUtils.uncapitalize(simpleName));
            data.put("[table]", tltCls.table());
            data.put("[classComment]", tltCls.comments());
            data.put("[rootRequestMapping]", tltCls.requestMapping());
        }
    }

    /**
     * 验证文件是否存在
     */
    private void checkFileExist() throws TLtFileNotFoundException {

        if (tltConfiguration == null
                || StringUtils.isEmpty(tltConfiguration.getTemplateFile())) {
            throw new TLtFileNotFoundException("模板文件不存在！");
        }
    }

    /**
     *  检查数据流是否为空
     * @throws Exception
     */
    private void checkStreamIsNull() throws TltStreamNotFoundException {

        inputStream = CreateTlt.class.getResourceAsStream(tltConfiguration.getTemplateFile());

        if (inputStream == null) {
            throw new TltStreamNotFoundException("模板文件流读取失败！");
        }
    }

    /**
     * 创建模板文件
     * @throws Exception
     */
    public void createTempleteFile() throws Exception {
        read();
        write();
        System.out.println("生成文件成功");
    }

    /**
     * 读取resources中模板文件的内容
     */
    private void read() throws Exception {

        checkFileExist();
        checkStreamIsNull();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String line = null;

        while ((line = bufferedReader.readLine()) != null) {
            Set<String> keys = data.keySet();
            Iterator<String> keyIterator = keys.iterator();

            while (keyIterator.hasNext()) {
                String key = keyIterator.next();

                if (line.contains(key) || line.contains("[params]")) {

                    if (line.contains(TltConfiguration.TEMPLETE_FOR_INSTRUCT)) {

                        Annotation annotation = clazz.getAnnotation(TltCls.class);
                        if (annotation != null) {
                            line = forEntity(line);
                        }
                    } else {
                        line = line.replace(key, (String) data.get(key));
                    }
                }
            }

            sb.append(line).append("\n");
        }

        if (bufferedReader!=null) {
            bufferedReader.close();
        }

        if (inputStream!=null) {
            inputStream.close();
        }

    }

    /**
     * 保存数据
     */
    private void write() throws Exception {
        try {
            FileUtils fileUtils = new FileUtils();
            System.out.println(sb.toString());
            fileUtils.write(tltConfiguration.getDescFile(), sb.toString());
        } catch (Exception e) {
            throw new Exception("保存文件失败!");
        }
    }

    /**
     * for 实体循环
     */
    private String forEntity(String line) throws Exception {
        StringBuffer sb = new StringBuffer(TltConfiguration.EMPTY_STR);
        String resLine = "";

        Field[] fields = clazz.getDeclaredFields();

        for (int i=0 ;i<fields.length ;i++) {
            resLine = line;
            Annotation fieldAnnotation = fields[i].getAnnotation(TltFld.class);
            TltFld tltFld = (TltFld) fieldAnnotation;
            Method[] declaredMethods = tltFld.getClass().getDeclaredMethods();

            for (Method method : declaredMethods) {
                method.setAccessible(true);

                if ((!method.getName().equals(TltConfiguration.ANNOTATION_IGNORE_METHOD_EQUALS))
                        && (!method.getName().equals(TltConfiguration.ANNOTATION_IGNORE_METHOD_TOSTRNG))
                        && (!method.getName().equals(TltConfiguration.ANNOTATION_IGNORE_METHOD_HASHCODE))
                        && (!method.getName().equals(TltConfiguration.ANNOTATION_IGNORE_METHOD_ANNOTATIONTYPE))) {
                    resLine = resLine.replace("[" + method.getName() + "]",
                            TltConfiguration.EMPTY_STR + method.invoke(tltFld));
                }
            }

            if (i<fields.length-1){
                resLine = resLine.replace(TltConfiguration.COMMA,",");
            }else {
                resLine = resLine.replace(TltConfiguration.COMMA,"");
            }

            if (resLine.contains(TltConfiguration.SPLIT_FLAG)) {
                resLine = resLine.replace(TltConfiguration.END_TEMPLETE_FOR_INSTRUCT, TltConfiguration.EMPTY_STR).split(TltConfiguration.SPLIT_FLAG)[1];
            }

            sb.append(resLine).append("\n");
        }

        return sb.toString().endsWith(",") ? sb.toString().substring(0, sb.length() - 1) : sb.toString();
    }
}
