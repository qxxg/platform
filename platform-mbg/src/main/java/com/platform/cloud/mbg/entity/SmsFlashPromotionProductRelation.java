package com.platform.cloud.mbg.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

@Data
public class SmsFlashPromotionProductRelation implements Serializable {
    /** 编号 **/
    private Long id;

    private Long flashPromotionId;

    /** 编号 **/
    private Long flashPromotionSessionId;

    private Long productId;

    /** 限时购价格 **/
    private BigDecimal flashPromotionPrice;

    /** 限时购数量 **/
    private Integer flashPromotionCount;

    /** 每人限购数量 **/
    private Integer flashPromotionLimit;

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
        sb.append(", flashPromotionId=").append(flashPromotionId);
        sb.append(", flashPromotionSessionId=").append(flashPromotionSessionId);
        sb.append(", productId=").append(productId);
        sb.append(", flashPromotionPrice=").append(flashPromotionPrice);
        sb.append(", flashPromotionCount=").append(flashPromotionCount);
        sb.append(", flashPromotionLimit=").append(flashPromotionLimit);
        sb.append(", sort=").append(sort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}