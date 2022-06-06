package com.platform.cloud.sso.mapper;

import com.platform.cloud.sso.entity.UmsResource;
import com.platform.cloud.sso.entity.UmsResourceExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UmsResourceMapper {
    long countByExample(UmsResourceExample example);

    int deleteByExample(UmsResourceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsResource record);

    int insertSelective(UmsResource record);

    List<UmsResource> selectByExample(UmsResourceExample example);

    @Select("SELECT\n" +
            "            ur.id id,\n" +
            "            ur.create_time createTime,\n" +
            "            ur.`name` `name`,\n" +
            "            ur.url url,\n" +
            "            ur.description description,\n" +
            "            ur.category_id categoryId\n" +
            "        FROM\n" +
            "            ums_admin_role_relation ar\n" +
            "        LEFT JOIN ums_role r ON ar.role_id = r.id\n" +
            "        LEFT JOIN ums_role_resource_relation rrr ON r.id = rrr.role_id\n" +
            "        LEFT JOIN ums_resource ur ON ur.id = rrr.resource_id\n" +
            "        WHERE\n" +
            "            ar.admin_id = #{id}\n" +
            "        AND ur.id IS NOT NULL\n" +
            "        GROUP BY\n" +
            "            ur.id")
    List<UmsResource> selectByUserId(Long id);

    UmsResource selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsResource record, @Param("example") UmsResourceExample example);

    int updateByExample(@Param("record") UmsResource record, @Param("example") UmsResourceExample example);

    int updateByPrimaryKeySelective(UmsResource record);

    int updateByPrimaryKey(UmsResource record);
}