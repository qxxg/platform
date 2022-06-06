package com.platform.cloud.mbg.entity;

import java.io.Serializable;
import lombok.Data;

@Data
public class PmsProductAttributeCategory implements Serializable {
    private Long id;

    private String name;

    /** 属性数量 **/
    private Integer attributeCount;

    /** 参数数量 **/
    private Integer paramCount;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", attributeCount=").append(attributeCount);
        sb.append(", paramCount=").append(paramCount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}