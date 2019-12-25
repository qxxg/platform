package com.qxxg.springcloud.platformuser.service.impl;

import com.qxxg.springcloud.platformmbg.entity.Log;
import com.qxxg.springcloud.platformmbg.result.CommonResult;
import com.qxxg.springcloud.platformuser.service.FeginService;
import org.springframework.stereotype.Component;

/**
 * @Author: smallsand
 * @Date: 2019/11/20 17:16
 */
@Component
public class FeginServiceImpl implements FeginService {

    @Override
    public String info(Log log) {
        return "网络延时，请从新再试！！";
    }

    @Override
    public String getinfo(String name) {

            return "网络延时，请从新再试！！";
    }

    @Override
    public String infoById(String id) {

                return "网络延时，请从新再试！！";
    }

    @Override
    public CommonResult addRole() {
        return CommonResult.failed("网络延时，请从新再试！！");
    }
}
