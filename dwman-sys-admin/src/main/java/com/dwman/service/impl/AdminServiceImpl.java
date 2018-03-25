package com.dwman.service.impl;

import com.dwman.core.service.CoreServiceImpl;
import com.dwman.dao.AdminMapper;
import com.dwman.service.AdminService;
import org.springframework.stereotype.Service;


@Service("adminService")
public class AdminServiceImpl extends CoreServiceImpl<AdminMapper> implements AdminService {


}
