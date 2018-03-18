package com.dwman.service.impl;

import com.dwman.core.service.CoreServiceImpl;
import com.dwman.dao.DeptMapper;
import com.dwman.service.DeptService;
import org.springframework.stereotype.Service;


@Service("deptService")
public class DeptServiceImpl extends CoreServiceImpl<DeptMapper> implements DeptService{


}
