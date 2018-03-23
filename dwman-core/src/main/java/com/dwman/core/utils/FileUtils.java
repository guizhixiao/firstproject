package com.dwman.core.utils;

import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.List;

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
        if (!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
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

    /**
     * 通过路径得到路径下所有的文件
     * @param path  路径
     * @param isRecursive  是否递归 true 是  false 否
     * @return
     */
    public List<File> getFilesByPath(String path, boolean isRecursive, List<File> files)  throws Exception {

        if (StringUtils.isEmpty(path)) {
            throw new Exception("文件不存在！");
        }

        File file = new File(path);

        if (!file.exists()) {
            throw new Exception("文件不存在！");
        }

        File[] filesList = file.listFiles();
        for (File f: filesList) {
            if (f.isFile()) {
                files.add(f);
            }else if (f.isDirectory() &&isRecursive) {
               return getFilesByPath(f.getPath(),isRecursive,files);
            }
        }

        return files;
    }



}
