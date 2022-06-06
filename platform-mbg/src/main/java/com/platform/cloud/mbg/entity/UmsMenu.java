package com.platform.cloud.mbg.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class UmsMenu implements Serializable {
    private Long id;

    /** 父级ID **/
    private Long parentId;

    /** 创建时间 **/
    private Date createTime;

    /** 菜单名称 **/
    private String title;

    /** 菜单级数 **/
    private Integer level;

    /** 菜单排序 **/
    private Integer sort;

    /** 前端名称 **/
    private String name;

    /** 前端图标 **/
    private String icon;

    /** 前端隐藏 **/
    private Integer hidden;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", parentId=").append(parentId);
        sb.append(", createTime=").append(createTime);
        sb.append(", title=").append(title);
        sb.append(", level=").append(level);
        sb.append(", sort=").append(sort);
        sb.append(", name=").append(name);
        sb.append(", icon=").append(icon);
        sb.append(", hidden=").append(hidden);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}