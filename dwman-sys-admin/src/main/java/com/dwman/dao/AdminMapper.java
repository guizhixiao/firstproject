package com.dwman.dao;

import com.dwman.core.dao.BaseDao;
import com.dwman.entity.AdminEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface AdminMapper  extends BaseDao<AdminEntity>{

    List<Map<String,Object>> findAllByPageParam(Map<String,Object> map);
}