package com.platform.cloud.mbg.entity;

import java.io.Serializable;
import lombok.Data;

@Data
public class PmsProductCategory implements Serializable {
    private Long id;

    /** 上机分类的编号：0表示一级分类 **/
    private Long parentId;

    private String name;

    /** 分类级别：0->1级；1->2级 **/
    private Integer level;

    private Integer productCount;

    private String productUnit;

    /** 是否显示在导航栏：0->不显示；1->显示 **/
    private Integer navStatus;

    /** 显示状态：0->不显示；1->显示 **/
    private Integer showStatus;

    private Integer sort;

    /** 图标 **/
    private String icon;

    private String keywords;

    /** 描述 **/
    private String description;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", parentId=").append(parentId);
        sb.append(", name=").append(name);
        sb.append(", level=").append(level);
        sb.append(", productCount=").append(productCount);
        sb.append(", productUnit=").append(productUnit);
        sb.append(", navStatus=").append(navStatus);
        sb.append(", showStatus=").append(showStatus);
        sb.append(", sort=").append(sort);
        sb.append(", icon=").append(icon);
        sb.append(", keywords=").append(keywords);
        sb.append(", description=").append(description);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}