package com.platform.cloud.mbg.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

@Data
public class PmsProductLadder implements Serializable {
    private Long id;

    private Long productId;

    /** 满足的商品数量 **/
    private Integer count;

    /** 折扣 **/
    private BigDecimal discount;

    /** 折后价格 **/
    private BigDecimal price;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productId=").append(productId);
        sb.append(", count=").append(count);
        sb.append(", discount=").append(discount);
        sb.append(", price=").append(price);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}