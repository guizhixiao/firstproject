package com.dwman.core.dao;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * 默认Dao
 * @param <T>
 */
@Component
public interface BaseDao<T> {

    Long update(T t) ;
    Long deleteById(Long id ) ;
    Long insert(T t) ;

    Map<String,Object> findById(Long id) ;
    Long findCountByPageParam(Map<String,Object> map);
    List<Map<String,Object>> findAllByPageParam(Map<String,Object> map) ;

}
