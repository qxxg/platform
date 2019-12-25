package com.qxxg.springcloud.platformmbg.service.impl;

import com.qxxg.springcloud.platformmbg.entity.WebLogAop;
import com.qxxg.springcloud.platformmbg.mapper.WebLogAopMapper;
import com.qxxg.springcloud.platformmbg.service.WebLogAopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: smallsand
 * @Date: 2019/12/10 16:54
 */
@Service
public class WebLogAopServiceImpl implements WebLogAopService {

    @Autowired
    private WebLogAopMapper webLogAopMapper;

    public int saveWebLogAop(WebLogAop wla){
        return webLogAopMapper.insertSelective(wla);
    }
}
