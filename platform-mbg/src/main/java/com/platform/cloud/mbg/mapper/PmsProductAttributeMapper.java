package com.platform.cloud.mbg.mapper;

import com.platform.cloud.mbg.entity.PmsProductAttribute;
import com.platform.cloud.mbg.entity.PmsProductAttributeExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmsProductAttributeMapper {
    long countByExample(PmsProductAttributeExample example);

    int deleteByExample(PmsProductAttributeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsProductAttribute record);

    int insertSelective(PmsProductAttribute record);

    List<PmsProductAttribute> selectByExample(PmsProductAttributeExample example);

    PmsProductAttribute selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsProductAttribute record, @Param("example") PmsProductAttributeExample example);

    int updateByExample(@Param("record") PmsProductAttribute record, @Param("example") PmsProductAttributeExample example);

    int updateByPrimaryKeySelective(PmsProductAttribute record);

    int updateByPrimaryKey(PmsProductAttribute record);
}