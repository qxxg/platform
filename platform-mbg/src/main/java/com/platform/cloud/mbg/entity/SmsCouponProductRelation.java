package com.platform.cloud.mbg.entity;

import java.io.Serializable;
import lombok.Data;

@Data
public class SmsCouponProductRelation implements Serializable {
    private Long id;

    private Long couponId;

    private Long productId;

    /** 商品名称 **/
    private String productName;

    /** 商品编码 **/
    private String productSn;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", couponId=").append(couponId);
        sb.append(", productId=").append(productId);
        sb.append(", productName=").append(productName);
        sb.append(", productSn=").append(productSn);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}