package com.dwman.biz;

import com.dwman.core.biz.AbstractBiz;
import com.dwman.core.biz.BaseBiz;
import com.dwman.core.dto.*;
import com.dwman.service.AdminService;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("admin")
@Api(value = "系统用户表")
public class AdminBiz extends AbstractBiz<AdminService> implements BaseBiz<AdminService> {

    /**
     * 分页查询数据
     * @return
     * @throws Exception
     */
    @ApiOperation("分页查询数据连")
    @ApiImplicitParams({
@ApiImplicitParam(name = "id",value = "id"),
@ApiImplicitParam(name = "name",value = "姓名"),
@ApiImplicitParam(name = "age",value = "年龄"),
@ApiImplicitParam(name = "phone",value = "手机号码"),
@ApiImplicitParam(name = "address",value = "地址"),
@ApiImplicitParam(name = "email",value = "email"),
@ApiImplicitParam(name = "qq",value = "qq"),
@ApiImplicitParam(name = "createTime",value = "创建时间"),
@ApiImplicitParam(name = "createUser",value = "创建人"),
@ApiImplicitParam(name = "remark",value = "备注"),
@ApiImplicitParam(name = "useFlag",value = "是否使用"),
@ApiImplicitParam(name = "delFlag",value = "是否删除")

    })
    @RequestMapping(value = "/list",method = RequestMethod.POST)
    protected ResultListViewData list() throws Exception {
        Map<String,Object> param = requestToMap();
        return super.list(param);
    }

    /**
     * 查询总共数据量
     * @return
     * @throws Exception
     */
    @ApiOperation("查询数据总量")
    @RequestMapping(value = "/total",method = RequestMethod.POST)
    @ApiImplicitParams({
@ApiImplicitParam(name = "id",value = "id"),
@ApiImplicitParam(name = "name",value = "姓名"),
@ApiImplicitParam(name = "age",value = "年龄"),
@ApiImplicitParam(name = "phone",value = "手机号码"),
@ApiImplicitParam(name = "address",value = "地址"),
@ApiImplicitParam(name = "email",value = "email"),
@ApiImplicitParam(name = "qq",value = "qq"),
@ApiImplicitParam(name = "createTime",value = "创建时间"),
@ApiImplicitParam(name = "createUser",value = "创建人"),
@ApiImplicitParam(name = "remark",value = "备注"),
@ApiImplicitParam(name = "useFlag",value = "是否使用"),
@ApiImplicitParam(name = "delFlag",value = "是否删除")

    })
    protected ResultTotalViewData dataTotalCount() throws Exception {
        Map<String,Object> map = requestToMap();
        return super.dataTotalCount( map);
    }

    /**
     * 查询一天数据记录
     * @param id
     * @return
     * @throws Exception
     */
    @ApiOperation("根据id得到用户信息")
    @ApiImplicitParam(required = true ,name = "id" ,value = "主键",paramType = "jquery")
    @RequestMapping(value = "/findOne/{id}",method = RequestMethod.GET)
    @Override
    protected ResultFindOneViewData findById(@PathVariable("id") Long id) throws Exception {
        return super.findById(id);
    }

    @ApiOperation("修改数据信息")
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ApiImplicitParams({
@ApiImplicitParam(name = "id",value = "id"),
@ApiImplicitParam(name = "name",value = "姓名"),
@ApiImplicitParam(name = "age",value = "年龄"),
@ApiImplicitParam(name = "phone",value = "手机号码"),
@ApiImplicitParam(name = "address",value = "地址"),
@ApiImplicitParam(name = "email",value = "email"),
@ApiImplicitParam(name = "qq",value = "qq"),
@ApiImplicitParam(name = "createTime",value = "创建时间"),
@ApiImplicitParam(name = "createUser",value = "创建人"),
@ApiImplicitParam(name = "remark",value = "备注"),
@ApiImplicitParam(name = "useFlag",value = "是否使用"),
@ApiImplicitParam(name = "delFlag",value = "是否删除")

    })
    protected ResultUpdateViewDate update() throws Exception {
        Map<String,Object> map = requestToMap();
        return super.update(map);
    }

    @ApiOperation("新增数据信息")
    @RequestMapping(value = "insert",method = RequestMethod.POST)
    @ApiImplicitParams({
@ApiImplicitParam(name = "id",value = "id"),
@ApiImplicitParam(name = "name",value = "姓名"),
@ApiImplicitParam(name = "age",value = "年龄"),
@ApiImplicitParam(name = "phone",value = "手机号码"),
@ApiImplicitParam(name = "address",value = "地址"),
@ApiImplicitParam(name = "email",value = "email"),
@ApiImplicitParam(name = "qq",value = "qq"),
@ApiImplicitParam(name = "createTime",value = "创建时间"),
@ApiImplicitParam(name = "createUser",value = "创建人"),
@ApiImplicitParam(name = "remark",value = "备注"),
@ApiImplicitParam(name = "useFlag",value = "是否使用"),
@ApiImplicitParam(name = "delFlag",value = "是否删除")

    })
    protected ResultInsertViewData insert() throws Exception {
        Map<String,Object> map = requestToMap();
        return super.insert(map);
    }

    @ApiOperation("删除数据信息")
    @ApiImplicitParam(paramType = "query",name = "id",value = "主键")
    @RequestMapping(value = "/delete/{id}",method = {RequestMethod.GET,RequestMethod.POST})
    @Override
    protected ResultDeleteViewData delete(@PathVariable("id") Long id) throws Exception {
        return super.delete( id);
    }
}
