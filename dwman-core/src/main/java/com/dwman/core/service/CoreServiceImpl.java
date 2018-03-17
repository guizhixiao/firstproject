package com.dwman.core.service;

import com.dwman.core.dao.BaseDao;
import com.dwman.core.dto.*;
import com.dwman.core.utils.DateTimeUtils;
import com.dwman.core.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 核心实现
 */
public class CoreServiceImpl<T extends BaseDao> implements BaseService<T> {

    @Autowired
    private T baseDao;

    /**
     * 分页查询数据
     *
     * @param map
     * @return
     * @throws Exception
     */
    @Override
    public ResultListViewData listAllByPageParam(Map<String, Object> map) throws Exception {
        ResultListViewData result = new ResultListViewData();
        Long totalSize = baseDao.findCountByPageParam(map);
        Long current = PageUtils.getCurrent(map);
        Long size = PageUtils.getSize(map);
        Long totalPage = totalSize % size == 0 ? (totalSize / size) : (totalSize / size + 1);

        result.setTotalSize(totalSize);
        result.setCurrent(current);
        result.setSize(size);
        result.setTotalPage(totalPage);
        result.setTotalSize(totalSize);

        if (current <= 1) {
            result.setPrePage(false);
        }

        if (totalPage <= current) {
            result.setNextPage(false);
        }

        List<Map<String, Object>> data = baseDao.findAllByPageParam(map);

        if (data == null) {
            data = new ArrayList<Map<String, Object>>();
            result.setStateName("查询失败");
            result.setStateCode("100");
        } else {
            result.setStateCode("200");
            result.setStateName("查询成功");
        }
        result.setData(data);

        result.setClassName(this.getClass().getSimpleName());
        result.setMethodName("listAllByPageParam");
        result.setResultTime(DateTimeUtils.FULL_DATE.format(new Date()));

        return result;
    }

    /**
     * 此处可以和listAllByPageParam 中的数据进行合并使用
     *
     * @param map
     * @return
     * @throws Exception
     */
    @Override
    public ResultTotalViewData dataTotalCount(Map<String, Object> map) throws Exception {
        ResultTotalViewData result = new ResultTotalViewData();
        result.setClassName(this.getClass().getSimpleName());
        result.setMethodName("listAllByPageParam");
        result.setResultTime(DateTimeUtils.FULL_DATE.format(new Date()));
        Long totalSize = baseDao.findCountByPageParam(map);
        Long current = PageUtils.getCurrent(map);
        Long size = PageUtils.getSize(map);
        Long totalPage = totalSize % size == 0 ? (totalSize / size) : (totalSize / size + 1);
        result.setTotalSize(totalSize);
        result.setCurrent(current);
        result.setSize(size);
        result.setTotalPage(totalPage);

        if (totalSize <= 0) {
            result.setStateName("查询失败");
            result.setStateCode("100");
        } else {
            result.setStateCode("200");
            result.setStateName("查询成功");
        }
        return result;
    }

    /***
     * 根据id查询一条数据记录
     * @param id
     * @return
     * @throws Exception
     */
    @Override
    public ResultFindOneViewData findOneById(Long id) throws Exception {
        Map<String, Object> data = baseDao.findById(id);
        ResultFindOneViewData result = new ResultFindOneViewData();
        result.setData(data);
        result.setClassName(this.getClass().getSimpleName());
        result.setMethodName("findOneById");
        result.setData(data);

        if (data != null) {
            result.setStateCode("200");
            result.setStateName("查询成功");
        } else {
            result.setStateCode("100");
            result.setStateName("查询失败");
        }
        result.setResultTime(DateTimeUtils.FULL_DATE.format(new Date()));
        return result;
    }

    @Override
    public ResultDeleteViewData deleteOneById(Long id) throws Exception {
        ResultDeleteViewData result = new ResultDeleteViewData();
        Long count = baseDao.deleteById(id);
        result.setClassName(this.getClass().getSimpleName());
        result.setMethodName("findOneById");
        result.setDeleteCount(count);
        result.setClassName(this.getClass().getSimpleName());
        result.setMethodName("deleteOneById");
        result.setResultTime(DateTimeUtils.FULL_DATE.format(new Date()));

        if (count >= 1) {
            result.setStateCode("200");
            result.setStateName("删除成功");
        } else {
            result.setStateCode("100");
            result.setStateName("删除失败");
        }

        return result;
    }

    @Transactional
    @Override
    public ResultUpdateViewDate update(Map<String, Object> map) throws Exception {
        ResultUpdateViewDate result = new ResultUpdateViewDate();
        Long count = baseDao.update(map);
        result.setClassName(this.getClass().getSimpleName());
        result.setMethodName("findOneById");
        result.setUpdateCountData(count);
        result.setClassName(this.getClass().getSimpleName());
        result.setMethodName("deleteOneById");
        result.setResultTime(DateTimeUtils.FULL_DATE.format(new Date()));

        if (count >= 1) {
            result.setStateCode("200");
            result.setStateName("修改成功");
        } else {
            result.setStateCode("100");
            result.setStateName("修改失败");
        }

        return result;
    }

    @Transactional
    @Override
    public ResultInsertViewData insert(Map<String, Object> map) throws Exception {
        ResultInsertViewData result = new ResultInsertViewData();
        Long count = baseDao.insert(map);
        result.setClassName(this.getClass().getSimpleName());
        result.setMethodName("findOneById");
        result.setInsertCountData(count);
        result.setClassName(this.getClass().getSimpleName());
        result.setMethodName("deleteOneById");
        result.setResultTime(DateTimeUtils.FULL_DATE.format(new Date()));

        if (count >= 1) {
            result.setStateCode("200");
            result.setStateName("新增成功");
        } else {
            result.setStateCode("100");
            result.setStateName("新增失败");
        }

        return result;
    }
}
