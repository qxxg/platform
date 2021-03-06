package com.qxxg.springcloud.platformseataa.service.impl;


import com.qxxg.springcloud.platformseataa.entity.Log;
import com.qxxg.springcloud.platformseataa.result.CommonResult;
import com.qxxg.springcloud.platformseataa.service.FeginService;
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
