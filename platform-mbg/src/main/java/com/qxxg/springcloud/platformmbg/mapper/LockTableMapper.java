package com.qxxg.springcloud.platformmbg.mapper;

import com.qxxg.springcloud.platformmbg.entity.LockTable;
import com.qxxg.springcloud.platformmbg.entity.LockTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2019/12/10
*/
public interface LockTableMapper {
    int countByExample(LockTableExample example);

    int deleteByExample(LockTableExample example);

    int deleteByPrimaryKey(String rowKey);

    int insert(LockTable record);

    int insertSelective(LockTable record);

    List<LockTable> selectByExampleWithBLOBs(LockTableExample example);

    List<LockTable> selectByExample(LockTableExample example);

    LockTable selectByPrimaryKey(String rowKey);

    int updateByExampleSelective(@Param("record") LockTable record, @Param("example") LockTableExample example);

    int updateByExampleWithBLOBs(@Param("record") LockTable record, @Param("example") LockTableExample example);

    int updateByExample(@Param("record") LockTable record, @Param("example") LockTableExample example);

    int updateByPrimaryKeySelective(LockTable record);

    int updateByPrimaryKeyWithBLOBs(LockTable record);

    int updateByPrimaryKey(LockTable record);
}