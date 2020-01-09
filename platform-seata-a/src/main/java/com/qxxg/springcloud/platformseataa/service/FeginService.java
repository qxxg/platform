package com.qxxg.springcloud.platformseataa.service;

import com.qxxg.springcloud.platformseataa.entity.Log;
import com.qxxg.springcloud.platformseataa.result.CommonResult;
import com.qxxg.springcloud.platformseataa.service.impl.FeginServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: smallsand
 * @Date: 2019/11/20 17:12
 */
@FeignClient(name = "platform-seata-b",fallback = FeginServiceImpl.class)
public interface FeginService {

    @RequestMapping(value = "/log/info",method = RequestMethod.GET,consumes = "application/json")
    public String info(@RequestBody Log log);

    @RequestMapping(value = "/log/getinfo",method = RequestMethod.GET)
    public String getinfo(@RequestParam("name") String name);

    @RequestMapping(value = "/log/infos",method = RequestMethod.GET)
    public String infoById(@RequestParam("id") String id);

    @RequestMapping(value = "/log/addrole",method = RequestMethod.GET)
    public CommonResult addRole();
}
