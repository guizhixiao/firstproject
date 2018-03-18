package com.dwman.core.dao;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * 默认Dao
 *
 * @param
 */
//@Component
public interface BaseDao {

    Long update(Map<String,Object> t);

    Long deleteById(Long id);

    Long insert(Map<String,Object> t);

    Map<String, Object> findById(Long id);

    Long findCountByPageParam(Map<String, Object> map);

    List<Map<String, Object>> findAllByPageParam(Map<String, Object> map);

}
