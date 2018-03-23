package com.dwman.core.utils;

import org.junit.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ProjectUtilsTest {

    @Test
    public void projectRootPath() throws Exception {
        ProjectUtils projectUtils = new ProjectUtils();
        String rootPath = projectUtils.projectRootPath();
        FileUtils fileUtils = new FileUtils();
        List<File> lists = fileUtils.getFilesByPath(rootPath,false,new ArrayList<>());
        for (File f :   lists) {
            System.out.println(f.getPath());
            System.out.println(f.getName());
        }
    }

    @Test
    public void codePath() {
    }
}