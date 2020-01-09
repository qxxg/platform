package com.qxxg.springcloud.platformseataa.mapper;
import com.qxxg.springcloud.platformseataa.entity.UmsMember;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* Created by Mybatis Generator on 2019/12/10
*/
public interface UmsMemberMapper {
    int deleteByPrimaryKey(Long id);
    int insert(UmsMember record);
    int insertSelective(UmsMember record);

    UmsMember selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMember record);

    int updateByPrimaryKey(UmsMember record);
}