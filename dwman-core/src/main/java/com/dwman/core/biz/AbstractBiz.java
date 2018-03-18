package com.dwman.core.biz;

import com.dwman.core.dto.*;
import com.dwman.core.service.BaseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public abstract class AbstractBiz<T extends BaseService> implements BaseBiz<T>  {

    @Autowired
    protected T baseService;
    @Autowired
    protected HttpServletRequest request;

    /**
     * 查询操作
     * param中参数 ，
     * current 当前页
     * size 每页数量
     * param 数量
     *
     * @return
     */
    protected ResultListViewData list(Map<String, Object> param) throws Exception {
        return baseService.listAllByPageParam(param);
    }

    /**
     * 数据总量
     *
     * @param map
     * @return
     */
    protected ResultTotalViewData dataTotalCount(Map<String, Object> map) throws Exception {
        return baseService.dataTotalCount(map);
    }


    protected ResultFindOneViewData findById(Long id) throws Exception {
        return baseService.findOneById(id);
    }

    /**
     * 更新操作
     *
     * @param map
     * @return
     */
    protected ResultUpdateViewDate update(Map<String, Object> map) throws Exception {
        return baseService.update(map);
    }

    /**
     * 插入操作
     *
     * @param map
     * @return
     * @throws Exception
     */
    protected ResultInsertViewData insert(Map<String, Object> map) throws Exception {
        return baseService.insert(map);
    }

    /***
     * 删除数据
     * @param id
     * @return
     * @throws Exception
     */
    protected ResultDeleteViewData delete(Long id) throws Exception {
        return baseService.deleteOneById(id);
    }

    /**
     * @return
     */
    protected Map<String, Object> requestToMap() {
        Enumeration<String> names = request.getParameterNames();
        Map<String, Object> map = new HashMap<String, Object>();

        while (names.hasMoreElements()) {

            String name = names.nextElement();
            String value = request.getParameter(name);

            if (StringUtils.isNotEmpty(name)) {
                map.put(name, StringUtils.isEmpty(value) ? "" : value);
            }

        }

        return map;

    }
}
