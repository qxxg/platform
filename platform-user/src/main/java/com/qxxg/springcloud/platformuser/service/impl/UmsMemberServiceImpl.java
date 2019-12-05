package com.qxxg.springcloud.platformuser.service.impl;

import com.qxxg.springcloud.platformmbg.entity.UmsMember;
import com.qxxg.springcloud.platformmbg.mapper.UmsMemberMapper;
import com.qxxg.springcloud.platformuser.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public int addUmsMember(UmsMember um){
        return umsMemberMapper.insert(um);
    }

}
