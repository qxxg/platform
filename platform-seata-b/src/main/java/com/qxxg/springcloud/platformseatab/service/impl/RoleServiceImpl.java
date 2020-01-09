package com.qxxg.springcloud.platformseatab.service.impl;

import com.qxxg.springcloud.platformseatab.entity.UmsRole;
import com.qxxg.springcloud.platformseatab.mapper.UmsRoleMapper;
import com.qxxg.springcloud.platformseatab.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: smallsand
 * @Date: 2019/12/6 16:05
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private UmsRoleMapper umsRoleMapper;

    @Override
    @Transactional
    public int insertSelective(UmsRole record) {
        try {
            return umsRoleMapper.insertSelective(record);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
