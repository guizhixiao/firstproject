package com.dwman.service.impl;

import com.dwman.core.service.CoreServiceImpl;
import com.dwman.dao.RoleMapper;
import com.dwman.service.RoleService;
import org.springframework.stereotype.Service;


@Service("roleService")
public class RoleServiceImpl extends CoreServiceImpl<RoleMapper> implements RoleService {


}
