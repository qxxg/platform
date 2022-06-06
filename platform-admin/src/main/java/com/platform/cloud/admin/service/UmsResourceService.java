package com.platform.cloud.admin.service;

import com.platform.cloud.mbg.entity.UmsResource;
import com.platform.cloud.mbg.entity.UmsResourceExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description: TODO
 * @author: WangYong
 * @date: 2022-06-05
 */
public interface UmsResourceService {
    long countByExample(UmsResourceExample example);

    int deleteByExample(UmsResourceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsResource record);

    int insertSelective(UmsResource record);

    List<UmsResource> selectByExample(UmsResourceExample example);

    UmsResource selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsResource record, @Param("example") UmsResourceExample example);

    int updateByExample(@Param("record") UmsResource record, @Param("example") UmsResourceExample example);

    int updateByPrimaryKeySelective(UmsResource record);

    int updateByPrimaryKey(UmsResource record);
}
