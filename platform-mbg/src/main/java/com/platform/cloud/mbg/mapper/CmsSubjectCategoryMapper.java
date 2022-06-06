package com.platform.cloud.mbg.mapper;

import com.platform.cloud.mbg.entity.CmsSubjectCategory;
import com.platform.cloud.mbg.entity.CmsSubjectCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CmsSubjectCategoryMapper {
    long countByExample(CmsSubjectCategoryExample example);

    int deleteByExample(CmsSubjectCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmsSubjectCategory record);

    int insertSelective(CmsSubjectCategory record);

    List<CmsSubjectCategory> selectByExample(CmsSubjectCategoryExample example);

    CmsSubjectCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmsSubjectCategory record, @Param("example") CmsSubjectCategoryExample example);

    int updateByExample(@Param("record") CmsSubjectCategory record, @Param("example") CmsSubjectCategoryExample example);

    int updateByPrimaryKeySelective(CmsSubjectCategory record);

    int updateByPrimaryKey(CmsSubjectCategory record);
}