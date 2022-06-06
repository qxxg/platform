package com.platform.cloud.mbg.mapper;

import com.platform.cloud.mbg.entity.OmsCompanyAddress;
import com.platform.cloud.mbg.entity.OmsCompanyAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OmsCompanyAddressMapper {
    long countByExample(OmsCompanyAddressExample example);

    int deleteByExample(OmsCompanyAddressExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OmsCompanyAddress record);

    int insertSelective(OmsCompanyAddress record);

    List<OmsCompanyAddress> selectByExample(OmsCompanyAddressExample example);

    OmsCompanyAddress selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OmsCompanyAddress record, @Param("example") OmsCompanyAddressExample example);

    int updateByExample(@Param("record") OmsCompanyAddress record, @Param("example") OmsCompanyAddressExample example);

    int updateByPrimaryKeySelective(OmsCompanyAddress record);

    int updateByPrimaryKey(OmsCompanyAddress record);
}