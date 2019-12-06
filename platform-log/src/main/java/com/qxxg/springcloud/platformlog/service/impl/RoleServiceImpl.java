package com.qxxg.springcloud.platformlog.service.impl;

import com.qxxg.springcloud.platformlog.service.RoleService;
import com.qxxg.springcloud.platformmbg.entity.UmsRole;
import com.qxxg.springcloud.platformmbg.mapper.UmsRoleMapper;
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
