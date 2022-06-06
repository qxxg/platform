package com.platform.cloud.sso.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class UmsResource implements Serializable {
    private Long id;

    /** 创建时间 **/
    private Date createTime;

    /** 资源名称 **/
    private String name;

    /** 资源URL **/
    private String url;

    /** 描述 **/
    private String description;

    /** 资源分类ID **/
    private Long categoryId;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", createTime=").append(createTime);
        sb.append(", name=").append(name);
        sb.append(", url=").append(url);
        sb.append(", description=").append(description);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}