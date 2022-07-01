package com.platform.cloud.admin.service;

import com.platform.cloud.mbg.entity.UmsAdmin;
import com.platform.cloud.mbg.entity.UmsAdminExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;
import java.util.List;

/**
 * @Description: TODO
 * @author: WangYong
 * @date: 2022-06-05
 */
public interface UmsAdminService {
    long countByExample(UmsAdminExample example);

    int deleteByExample(UmsAdminExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsAdmin record);

    int insertSelective(UmsAdmin record) throws Exception;

    List<UmsAdmin> selectByExample(Integer pageSize,Integer page, Principal principal);

    UmsAdmin selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsAdmin record, @Param("example") UmsAdminExample example);

    int updateByExample(@Param("record") UmsAdmin record, @Param("example") UmsAdminExample example);

    int updateByPrimaryKeySelective(UmsAdmin record);

    int updateByPrimaryKey(UmsAdmin record);
}
