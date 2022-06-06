package com.platform.cloud.mbg.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

@Data
public class UmsMemberTag implements Serializable {
    private Long id;

    private String name;

    /** 自动打标签完成订单数量 **/
    private Integer finishOrderCount;

    /** 自动打标签完成订单金额 **/
    private BigDecimal finishOrderAmount;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", finishOrderCount=").append(finishOrderCount);
        sb.append(", finishOrderAmount=").append(finishOrderAmount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}