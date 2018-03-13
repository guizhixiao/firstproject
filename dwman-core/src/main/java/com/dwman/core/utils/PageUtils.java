package com.dwman.core.utils;

import com.dwman.core.entity.PageEntity;
import org.apache.commons.lang3.StringUtils;

import java.util.Map;

/**
 * 分页使用的方法
 */
public class PageUtils {

    static PageEntity page = new PageEntity();

    /**
     * 得到当前页面
     * @param map
     * @return
     */
    public static Long getCurrent(Map<String, Object> map) {
        Long current = page.getCurrent();
        if (map!=null && StringUtils.isNotEmpty((String)map.get("current"))) {
            current = Long.parseLong((String) map.get("current"));
        }
        return current ;
    }

    /**
     * 得到size的数据
     * @param map
     * @return
     */
    public static Long getSize(Map<String,Object> map) {
        Long size = page.getSize() ;
        if (map!=null && StringUtils.isNotEmpty((String)map.get("size"))){
            size = Long.parseLong((String) map.get("size"));
        }
        return size;
    }


}
