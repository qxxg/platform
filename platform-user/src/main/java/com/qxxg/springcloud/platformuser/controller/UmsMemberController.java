package com.qxxg.springcloud.platformuser.controller;


import com.github.pagehelper.PageHelper;
import com.qxxg.springcloud.platformcommon.result.CommonPage;
import com.qxxg.springcloud.platformcommon.result.CommonResult;
import com.qxxg.springcloud.platformmbg.entity.Log;
import com.qxxg.springcloud.platformmbg.entity.UmsMember;
import com.qxxg.springcloud.platformmbg.entity.UmsRole;
import com.qxxg.springcloud.platformmbg.service.UmsMemberService;
import com.qxxg.springcloud.platformmbg.service.UmsRoleService;
import com.qxxg.springcloud.platformuser.service.FeginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 会员表 前端控制器
 * </p>
 *
 * @author smallsand
 * @since 2019-11-19
 */
@RestController
@Slf4j
@Api(value = "ums_memberCRUD接口")
@RequestMapping("/umsMember")
public class UmsMemberController {

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private UmsMemberService ums_memberService;

    @Autowired
    private UmsRoleService ums_roleService;

    @Autowired
    private FeginService feginServiceImpl;

    @ApiOperation(value = "获取ums_member列表", notes = "")
    @ApiImplicitParam(name = "map", value = "ums_member实体中的参数", required = true, dataType = "Map")
    @GetMapping("/")
    public CommonResult ums_memberList(@RequestParam Map<String, Object> map,
                                       @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                       @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) throws Exception {
        PageHelper.startPage(pageNum, pageSize);
        Collection<UmsMember> ums_memberList = ums_memberService.listByMap(map);
        return CommonResult.success(CommonPage.restPage((List<UmsMember>)ums_memberList));
    }

    @ApiOperation(value = "修改ums_member", notes = "根据id修改ums_member")
    @ApiImplicitParam(name = "ums_member", value = "ums_member实体", required = true, dataType = "Student")
    @PutMapping("/")
    public CommonResult ums_memberUpdate(@RequestBody UmsMember ums_member) throws Exception {

        Boolean flag = ums_memberService.updateById(ums_member);
        return CommonResult.success(flag);
    }


    @ApiOperation(value = "删除ums_member", notes = "根据id删除ums_member")
    @ApiImplicitParam(name = "id", value = "ums_memberid", required = true, dataType = "Long ")
    @DeleteMapping("/{id}")
    public CommonResult ums_memberDelete(@PathVariable Long id) throws Exception {
        Boolean flag = ums_memberService.removeById(id);
        return CommonResult.success(flag);
    }

    @ApiOperation(value = "添加ums_member", notes = "新增一条ums_member")
    @ApiImplicitParam(name = "ums_member", value = "ums_member实体", required = true, dataType = "ums_member")
    @PostMapping("")
    @Transactional(value = "financeCore")
    public CommonResult ums_memberAdd(Principal user,@RequestBody UmsMember ums_member) {
        System.out.println(">>>>>>>>>>>>userName: "+user.getName());
        Log log = new Log();
        log.setCreateTime(LocalDateTime.now());
        log.setUserName("测试");
        UmsRole role = new UmsRole();
        role.setCreateTime(LocalDateTime.now());
        role.setStatus(1);
        role.setName("ROLE_ADMIN");
        role.setSort(1);
        ums_roleService.save(role);
        ums_member.setPassword(passwordEncoder.encode(ums_member.getPassword()));
        String s = feginServiceImpl.info(log);
        String ss = feginServiceImpl.getinfo("张三");
        String sss = feginServiceImpl.infoById("1234");
        System.out.println("s============>:"+s);
        System.out.println("ss============>:"+ss);
        System.out.println("sss============>:"+sss);
        return CommonResult.success(ums_memberService.save(ums_member));
    }
}
