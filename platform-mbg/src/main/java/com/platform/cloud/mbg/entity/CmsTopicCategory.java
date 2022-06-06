package com.platform.cloud.mbg.entity;

import java.io.Serializable;
import lombok.Data;

@Data
public class CmsTopicCategory implements Serializable {
    private Long id;

    private String name;

    /** 分类图标 **/
    private String icon;

    /** 专题数量 **/
    private Integer subjectCount;

    private Integer showStatus;

    private Integer sort;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", icon=").append(icon);
        sb.append(", subjectCount=").append(subjectCount);
        sb.append(", showStatus=").append(showStatus);
        sb.append(", sort=").append(sort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}