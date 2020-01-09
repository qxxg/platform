package com.qxxg.springcloud.platformmbg.mapper;

import com.qxxg.springcloud.platformmbg.entity.WebLogAop;
import com.qxxg.springcloud.platformmbg.entity.WebLogAopExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2019/12/10
*/
public interface WebLogAopMapper {
    int countByExample(WebLogAopExample example);

    int deleteByExample(WebLogAopExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WebLogAop record);

    int insertSelective(WebLogAop record);

    List<WebLogAop> selectByExample(WebLogAopExample example);

    WebLogAop selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WebLogAop record, @Param("example") WebLogAopExample example);

    int updateByExample(@Param("record") WebLogAop record, @Param("example") WebLogAopExample example);

    int updateByPrimaryKeySelective(WebLogAop record);

    int updateByPrimaryKey(WebLogAop record);
}