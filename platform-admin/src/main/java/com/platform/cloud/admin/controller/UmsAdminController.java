package com.platform.cloud.admin.controller;

import com.platform.cloud.admin.service.UmsAdminService;
import com.platform.cloud.common.api.CommonPage;
import com.platform.cloud.common.api.CommonResult;
import com.platform.cloud.mbg.entity.UmsAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;


/**
 * 后台用户管理Controller
 */
@Controller
@RequestMapping("/admin")
public class UmsAdminController {

    @Autowired
    private UmsAdminService umsAdminServiceImpl;

    @GetMapping("/list")
    @ResponseBody
    public CommonResult list(@RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                             @RequestParam(value = "page", defaultValue = "1") Integer page, Principal principal){
            return CommonResult.success(CommonPage.restPage(umsAdminServiceImpl.selectByExample(pageSize,page,principal)));
    }

    /**
     * 测试事务回滚
     * @param admin
     * @return
     */
    @PostMapping("/insert")
    @ResponseBody
    public CommonResult insert(@RequestBody UmsAdmin admin){
        return CommonResult.success(umsAdminServiceImpl.insertSelective(admin));
    }

}
