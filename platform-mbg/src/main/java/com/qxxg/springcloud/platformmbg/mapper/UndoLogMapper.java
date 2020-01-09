package com.qxxg.springcloud.platformmbg.mapper;

import com.qxxg.springcloud.platformmbg.entity.UndoLog;
import com.qxxg.springcloud.platformmbg.entity.UndoLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2019/12/10
*/
public interface UndoLogMapper {
    int countByExample(UndoLogExample example);

    int deleteByExample(UndoLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UndoLog record);

    int insertSelective(UndoLog record);

    List<UndoLog> selectByExampleWithBLOBs(UndoLogExample example);

    List<UndoLog> selectByExample(UndoLogExample example);

    UndoLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UndoLog record, @Param("example") UndoLogExample example);

    int updateByExampleWithBLOBs(@Param("record") UndoLog record, @Param("example") UndoLogExample example);

    int updateByExample(@Param("record") UndoLog record, @Param("example") UndoLogExample example);

    int updateByPrimaryKeySelective(UndoLog record);

    int updateByPrimaryKeyWithBLOBs(UndoLog record);

    int updateByPrimaryKey(UndoLog record);
}