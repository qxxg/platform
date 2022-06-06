package com.platform.cloud.mbg.mapper;

import com.platform.cloud.mbg.entity.OmsOrderReturnApply;
import com.platform.cloud.mbg.entity.OmsOrderReturnApplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OmsOrderReturnApplyMapper {
    long countByExample(OmsOrderReturnApplyExample example);

    int deleteByExample(OmsOrderReturnApplyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OmsOrderReturnApply record);

    int insertSelective(OmsOrderReturnApply record);

    List<OmsOrderReturnApply> selectByExample(OmsOrderReturnApplyExample example);

    OmsOrderReturnApply selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OmsOrderReturnApply record, @Param("example") OmsOrderReturnApplyExample example);

    int updateByExample(@Param("record") OmsOrderReturnApply record, @Param("example") OmsOrderReturnApplyExample example);

    int updateByPrimaryKeySelective(OmsOrderReturnApply record);

    int updateByPrimaryKey(OmsOrderReturnApply record);
}