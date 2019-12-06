package com.qxxg.springcloud.platformuser.service.impl;

import com.qxxg.springcloud.platformcommon.result.CommonResult;
import com.qxxg.springcloud.platformmbg.entity.Log;
import com.qxxg.springcloud.platformmbg.entity.UmsMember;
import com.qxxg.springcloud.platformmbg.mapper.UmsMemberMapper;
import com.qxxg.springcloud.platformuser.service.FeginService;
import com.qxxg.springcloud.platformuser.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

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

    @Transactional(value = "financeCore")
    public int addUmsMember(UmsMember um){
        Log log = new Log();
        log.setCreateTime(LocalDateTime.now());
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
