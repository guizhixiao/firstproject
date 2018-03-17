package com.dwman.core.templete;

import com.dwman.core.utils.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.*;

/**
 * 通用Templete
 */
public class CommonFileTemplete {

    private TempleteFileEntity templeteFileEntity;
    private InputStream inputStream;
    private Map<String, Object> data;
    private static final String TEMPLETE_FOR_INSTRUCT = "[for]";
    private static final String END_TEMPLETE_FOR_INSTRUCT = "[/for]";
    StringBuffer sb = new StringBuffer();

    public CommonFileTemplete(TempleteFileEntity templeteFileEntity, Map<String, Object> data) {
        this.templeteFileEntity = templeteFileEntity;
        this.data = data;
    }

    /**
     * 验证文件是否存在
     */
    private void checkFileExist() throws Exception {

        if (templeteFileEntity == null || StringUtils.isEmpty(templeteFileEntity.getTemplateFile())) {
            throw new Exception("文件不存在!");
        }
    }

    private void checkStreamIsNull() throws Exception {

        inputStream = CommonFileTemplete.class.getResourceAsStream(templeteFileEntity.getTemplateFile());

        if (inputStream == null) {
            throw new Exception("读取文件失败！");
        }
    }

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

                if (line.contains(key)) {

                    if (line.contains(TEMPLETE_FOR_INSTRUCT)) {
                        Object object = (Object) data.get(key);

                        if (object instanceof List) {
                            List<Object> realList = (List<Object>) object;

                            if (realList.size() > 0) {
                                Object obj = realList.get(0);

                                if (obj instanceof Map) {
                                    line = forMap(line, realList);
                                } else {     //若果是基本类型
                                    line = forBaseType(line, realList);
                                }
                            }
                        } else if (object instanceof TempExtendsEntity) {
                            line = forEntity(line, object);
                        }
                    } else {
                        line = line.replace(key, (String) data.get(key));
                    }
                }
            }

            sb.append(CommondConvert.commondConvertCollection(line)).append("\n");
        }
    }

    /**
     * 保存数据
     */
    private void write() throws Exception {
        try {
            FileUtils fileUtils = new FileUtils();
            fileUtils.write(templeteFileEntity.getDescFile(), sb.toString());
        } catch (Exception e) {
            throw new Exception("保存文件失败!");
        }
    }

    /**
     * @param line
     * @param list
     * @return
     */
    private String forMap(String line, List<Object> list) {
        StringBuffer sb = new StringBuffer("");
        String resLine = "";

        for (Object map : list) {
            resLine = line;
            Set<String> inKeys = ((Map) map).keySet();
            Iterator<String> itKeys = inKeys.iterator();

            while (itKeys.hasNext()) {
                String inKey = itKeys.next();

                if (resLine.contains(inKey)) {
                    resLine = resLine.replace(inKey, (String) ((Map) map).get(inKey));
                }
            }

            if (resLine.contains("###")) {
                resLine = resLine.replace(END_TEMPLETE_FOR_INSTRUCT, "").split("###")[1];
            }
            sb.append(resLine).append("\n");
        }
        return sb.toString();
    }

    /**
     * for 实体循环
     */
    private String forEntity(String line, Object object) throws IllegalAccessException {
        StringBuffer sb = new StringBuffer("");
        String resLine = "";

        Field[] fields = object.getClass().getDeclaredFields();

        for (Field field : fields) {
            resLine = line;
            field.setAccessible(true);
            String fieldName = field.getName();
            Object fieldValue = field.get(object);
            resLine = resLine.replace("[name]", "" + fieldName);
            resLine = resLine.replace("[value]", "" + fieldValue);

            if (resLine.contains("###")) {
                resLine = resLine.replace(END_TEMPLETE_FOR_INSTRUCT, "").split("###")[1];
            }

            sb.append(resLine).append("\n");
        }

        return sb.toString();
    }

    /**
     * 基本数据类型
     *
     * @return
     */
    private String forBaseType(String line, List<Object> list) {
        StringBuffer sb = new StringBuffer("");
        String resLine = "";

        for (Object object : list) {
            resLine = line;
            resLine = resLine.replace("[value]", "" + object);

            if (resLine.contains("###")) {
                resLine = resLine.replace(END_TEMPLETE_FOR_INSTRUCT, "").split("###")[1];
            }
            sb.append(resLine).append("\n");
        }

        return sb.toString();
    }
}
