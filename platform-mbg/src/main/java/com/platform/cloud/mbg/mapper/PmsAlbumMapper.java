package com.platform.cloud.mbg.mapper;

import com.platform.cloud.mbg.entity.PmsAlbum;
import com.platform.cloud.mbg.entity.PmsAlbumExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmsAlbumMapper {
    long countByExample(PmsAlbumExample example);

    int deleteByExample(PmsAlbumExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsAlbum record);

    int insertSelective(PmsAlbum record);

    List<PmsAlbum> selectByExample(PmsAlbumExample example);

    PmsAlbum selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsAlbum record, @Param("example") PmsAlbumExample example);

    int updateByExample(@Param("record") PmsAlbum record, @Param("example") PmsAlbumExample example);

    int updateByPrimaryKeySelective(PmsAlbum record);

    int updateByPrimaryKey(PmsAlbum record);
}