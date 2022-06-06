package com.platform.cloud.mbg.mapper;

import com.platform.cloud.mbg.entity.OmsOrderItem;
import com.platform.cloud.mbg.entity.OmsOrderItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OmsOrderItemMapper {
    long countByExample(OmsOrderItemExample example);

    int deleteByExample(OmsOrderItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OmsOrderItem record);

    int insertSelective(OmsOrderItem record);

    List<OmsOrderItem> selectByExample(OmsOrderItemExample example);

    OmsOrderItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OmsOrderItem record, @Param("example") OmsOrderItemExample example);

    int updateByExample(@Param("record") OmsOrderItem record, @Param("example") OmsOrderItemExample example);

    int updateByPrimaryKeySelective(OmsOrderItem record);

    int updateByPrimaryKey(OmsOrderItem record);
}