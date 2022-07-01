package com.platform.cloud.admin.service.impl;

import com.github.pagehelper.PageHelper;
import com.platform.cloud.admin.service.UmsAdminService;
import com.platform.cloud.mbg.entity.UmsAdmin;
import com.platform.cloud.mbg.entity.UmsAdminExample;
import com.platform.cloud.mbg.mapper.UmsAdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.security.Principal;
import java.util.List;

/**
 * @Description: TODO
 * @author: WangYong
 * @date: 2022-06-05
 */
@Service
public class UmsAdminServiceImpl implements UmsAdminService {

    @Autowired
    private UmsAdminMapper umsAdminMapper;

    @Override
    public long countByExample(UmsAdminExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(UmsAdminExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int insert(UmsAdmin record) {
        return 0;
    }

    @Override
    @Transactional(value = "financeCore")
    public int insertSelective(UmsAdmin record)throws Exception {
        umsAdminMapper.deleteByPrimaryKey(9L);
        umsAdminMapper.insertSelective(record);
        return 0;
    }

    @Override
    public List<UmsAdmin> selectByExample(Integer pageSize,Integer page, Principal principal) {
        PageHelper.startPage(page,pageSize);
        return umsAdminMapper.selectByExample(null);
    }

    @Override
    public UmsAdmin selectByPrimaryKey(Long id) {
        return null;
    }

    @Override
    public int updateByExampleSelective(UmsAdmin record, UmsAdminExample example) {
        return 0;
    }

    @Override
    public int updateByExample(UmsAdmin record, UmsAdminExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(UmsAdmin record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(UmsAdmin record) {
        return 0;
    }
}
