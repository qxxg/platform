package com.qxxg.springcloud.platformlog.controller;


import com.qxxg.springcloud.platformmbg.entity.Log;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;


/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author smallsand
 * @since 2019-11-20
 */
@RestController
@Slf4j
@Api(value = "logCRUD接口")
@RequestMapping("/log")
public class LogController {

   @GetMapping("/info")
    public String info(@RequestBody Log log){
       System.out.println("============>l:"+log.toString());
        return "treu";
    }

    @GetMapping("/getinfo")
    public String getinfo(@RequestParam String name){
        System.out.println("name============>:"+name);
        return name;
    }

    @GetMapping("/infos")
    public String infoById(@RequestParam String id){
        System.out.println("id============>:"+id);
        return id;
    }
}
