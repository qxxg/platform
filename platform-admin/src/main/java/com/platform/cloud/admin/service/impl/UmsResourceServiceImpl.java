package com.platform.cloud.admin.service.impl;

import com.platform.cloud.admin.service.UmsResourceService;
import com.platform.cloud.mbg.entity.UmsResource;
import com.platform.cloud.mbg.entity.UmsResourceExample;
import com.platform.cloud.mbg.mapper.UmsResourceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: TODO
 * @author: WangYong
 * @date: 2022-06-05
 */
@Service
public class UmsResourceServiceImpl implements UmsResourceService {

    @Autowired
    private UmsResourceMapper umsResourceMapper;

    @Override
    public long countByExample(UmsResourceExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(UmsResourceExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int insert(UmsResource record) {
        return 0;
    }

    @Override
    public int insertSelective(UmsResource record) {
        return 0;
    }

    @Override
    public List<UmsResource> selectByExample(UmsResourceExample example) {
        return umsResourceMapper.selectByExample(example);
    }

    @Override
    public UmsResource selectByPrimaryKey(Long id) {
        return null;
    }

    @Override
    public int updateByExampleSelective(UmsResource record, UmsResourceExample example) {
        return 0;
    }

    @Override
    public int updateByExample(UmsResource record, UmsResourceExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(UmsResource record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(UmsResource record) {
        return 0;
    }
}
