package com.qxxg.springcloud.platformuser.service;

import com.qxxg.springcloud.platformmbg.entity.Log;
import com.qxxg.springcloud.platformuser.service.impl.FeginServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: smallsand
 * @Date: 2019/11/20 17:12
 */
@FeignClient(name = "platform-log",fallback = FeginServiceImpl.class)
public interface FeginService {

    @RequestMapping(value = "/log/info",method = RequestMethod.GET,consumes = "application/json")
    public String info(@RequestBody Log log);

    @RequestMapping(value = "/log/getinfo",method = RequestMethod.GET)
    public String getinfo(@RequestParam("name") String name);

    @RequestMapping(value = "/log/infos",method = RequestMethod.GET)
    public String infoById(@RequestParam("id") String id);
}
