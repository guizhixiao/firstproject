package com.dwman.core.biz;

import com.dwman.core.dto.*;
import com.dwman.core.service.BaseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * 本系统所有的数据全都采用分页的方式进行查询
 * 提供基本的增删查改功能
 * 基本的controller 接口
 */
public interface BaseBiz<T extends BaseService> {


}
