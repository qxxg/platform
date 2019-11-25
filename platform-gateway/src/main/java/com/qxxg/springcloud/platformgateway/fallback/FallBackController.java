package com.qxxg.springcloud.platformgateway.fallback;

import com.qxxg.springcloud.platformgateway.util.CommonResult;
import com.qxxg.springcloud.platformgateway.util.ResultCode;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: smallsand
 * @Date: 2019/11/22 17:24
 */
@RestController
public class FallBackController {

    @RequestMapping(value = "/fallbackcontroller")
    public CommonResult fallBackController() {

        return CommonResult.failed(ResultCode.SYSTEM_TIMEOUT);
    }

}
