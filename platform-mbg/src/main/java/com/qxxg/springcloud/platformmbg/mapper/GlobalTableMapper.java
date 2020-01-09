package com.qxxg.springcloud.platformmbg.mapper;

import com.qxxg.springcloud.platformmbg.entity.GlobalTable;
import com.qxxg.springcloud.platformmbg.entity.GlobalTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2019/12/10
*/
public interface GlobalTableMapper {
    int countByExample(GlobalTableExample example);

    int deleteByExample(GlobalTableExample example);

    int deleteByPrimaryKey(String xid);

    int insert(GlobalTable record);

    int insertSelective(GlobalTable record);

    List<GlobalTable> selectByExample(GlobalTableExample example);

    GlobalTable selectByPrimaryKey(String xid);

    int updateByExampleSelective(@Param("record") GlobalTable record, @Param("example") GlobalTableExample example);

    int updateByExample(@Param("record") GlobalTable record, @Param("example") GlobalTableExample example);

    int updateByPrimaryKeySelective(GlobalTable record);

    int updateByPrimaryKey(GlobalTable record);
}