package com.qxxg.springcloud.platformseataa.service.impl;

import com.qxxg.springcloud.platformseataa.entity.Log;
import com.qxxg.springcloud.platformseataa.entity.UmsMember;
import com.qxxg.springcloud.platformseataa.mapper.UmsMemberMapper;
import com.qxxg.springcloud.platformseataa.result.CommonResult;
import com.qxxg.springcloud.platformseataa.service.FeginService;
import com.qxxg.springcloud.platformseataa.service.UmsMemberService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author smallsand
 * @since 2019-11-14
 */
@Service
public class UmsMemberServiceImpl implements UmsMemberService {

    @Autowired
    private UmsMemberMapper umsMemberMapper;

    @Autowired
    private FeginService feginServiceImpl;

   // @Transactional(value = "financeCore")
   @GlobalTransactional(name = "my-test-create-order",rollbackFor = Exception.class)
    public int addUmsMember(UmsMember um){
        Log log = new Log();
        log.setCreateTime(new Date());
        log.setUserName("测试");
        String s = feginServiceImpl.info(log);
        String ss = feginServiceImpl.getinfo("张三");
        String sss = feginServiceImpl.infoById("1234");
        System.out.println("s============>:"+s);
        System.out.println("ss============>:"+ss);
        System.out.println("sss============>:"+sss);
        int insertUser = umsMemberMapper.insert(um);
        CommonResult commonResult = feginServiceImpl.addRole();
        if("00000".equals(commonResult.getCode()))
            return insertUser;
        else
            throw new RuntimeException("添加异常");
    }

}
