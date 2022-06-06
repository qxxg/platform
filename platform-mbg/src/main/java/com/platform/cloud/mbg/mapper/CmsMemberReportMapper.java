package com.platform.cloud.mbg.mapper;

import com.platform.cloud.mbg.entity.CmsMemberReport;
import com.platform.cloud.mbg.entity.CmsMemberReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CmsMemberReportMapper {
    long countByExample(CmsMemberReportExample example);

    int deleteByExample(CmsMemberReportExample example);

    int insert(CmsMemberReport record);

    int insertSelective(CmsMemberReport record);

    List<CmsMemberReport> selectByExample(CmsMemberReportExample example);

    int updateByExampleSelective(@Param("record") CmsMemberReport record, @Param("example") CmsMemberReportExample example);

    int updateByExample(@Param("record") CmsMemberReport record, @Param("example") CmsMemberReportExample example);
}