package com.dwman.core.service;

import com.dwman.core.dto.*;

import java.util.Map;

/***
 *  基础Service
 */
public interface BaseService<T> {

    public ResultListViewData listAllByPageParam(Map<String,Object> map) throws Exception;
    public ResultTotalViewData dataTotalCount(Map<String,Object> map) throws Exception;
    public ResultFindOneViewData findOneById(Long id) throws Exception;
    public ResultDeleteViewData deleteOneById(Long id) throws Exception ;
    public ResultUpdateViewDate update(Map<String,Object> map) throws Exception;
    public ResultInsertViewData insert(Map<String,Object> map) throws Exception;



}
