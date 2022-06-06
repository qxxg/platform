package com.platform.cloud.mbg.mapper;

import com.platform.cloud.mbg.entity.PmsBrand;
import com.platform.cloud.mbg.entity.PmsBrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmsBrandMapper {
    long countByExample(PmsBrandExample example);

    int deleteByExample(PmsBrandExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsBrand record);

    int insertSelective(PmsBrand record);

    List<PmsBrand> selectByExampleWithBLOBs(PmsBrandExample example);

    List<PmsBrand> selectByExample(PmsBrandExample example);

    PmsBrand selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsBrand record, @Param("example") PmsBrandExample example);

    int updateByExampleWithBLOBs(@Param("record") PmsBrand record, @Param("example") PmsBrandExample example);

    int updateByExample(@Param("record") PmsBrand record, @Param("example") PmsBrandExample example);

    int updateByPrimaryKeySelective(PmsBrand record);

    int updateByPrimaryKeyWithBLOBs(PmsBrand record);

    int updateByPrimaryKey(PmsBrand record);
}