package com.platform.cloud.mbg.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class UmsPermission implements Serializable {
    private Long id;

    /** 父级权限id **/
    private Long pid;

    /** 名称 **/
    private String name;

    /** 权限值 **/
    private String value;

    /** 图标 **/
    private String icon;

    /** 权限类型：0->目录；1->菜单；2->按钮（接口绑定权限） **/
    private Integer type;

    /** 前端资源路径 **/
    private String uri;

    /** 启用状态；0->禁用；1->启用 **/
    private Integer status;

    /** 创建时间 **/
    private Date createTime;

    /** 排序 **/
    private Integer sort;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pid=").append(pid);
        sb.append(", name=").append(name);
        sb.append(", value=").append(value);
        sb.append(", icon=").append(icon);
        sb.append(", type=").append(type);
        sb.append(", uri=").append(uri);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", sort=").append(sort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}