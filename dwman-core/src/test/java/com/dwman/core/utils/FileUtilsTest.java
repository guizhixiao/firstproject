package com.dwman.core.utils;

import org.junit.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FileUtilsTest {

    @Test
    public void write() {
    }

    @Test
    public void getFilesByPath() throws Exception {
        FileUtils fileUtils = new FileUtils();
        List<File> lists = fileUtils.getFilesByPath(".",true,new ArrayList<File>());
        for (File file : lists) {
            System.out.println(file.getPath());
            System.out.println(file.getName());
        }
    }
}