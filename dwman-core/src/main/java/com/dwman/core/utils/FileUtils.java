package com.dwman.core.utils;

import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

public class FileUtils {

    /**
     * 数据写入到文件中
     */
    public void write(String path, String msg) throws Exception {

        if (StringUtils.isEmpty(path)) {
            throw new Exception("路径不能为空！");
        }

        if (StringUtils.isEmpty(msg)) {
            throw new Exception("插入的内容不能为空！");
        }

        File file = new File(path);

        if (!file.exists()) {
            file.createNewFile();
        }

        OutputStream outputStream = new FileOutputStream(file);
        PrintWriter printWriter = new PrintWriter(outputStream);
        printWriter.write(msg);
        printWriter.flush();
        printWriter.close();
        outputStream.close();
    }

}
