package com.qxxg.springcloud.platformes.controller;

import com.qxxg.springcloud.platformes.service.EsService;
import com.qxxg.springcloud.platformmbg.result.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: smallsand
 * @Date: 2019/12/12 16:26
 */
@Controller
public class EsController {

    @Autowired
    private EsService esServiceImpl;

    @GetMapping("/info/es")
    public CommonResult infoEs(){
        return CommonResult.success(esServiceImpl.infoEs());
    }
}
