package com.dwman.service.impl;

import com.dwman.core.service.CoreServiceImpl;
import com.dwman.dao.AdminDeptMapper;
import com.dwman.service.AdminDeptService;
import org.springframework.stereotype.Service;


@Service("adminDeptService")
public class AdminDeptServiceImpl extends CoreServiceImpl<AdminDeptMapper> implements AdminDeptService {


}
