package com.platform.cloud.mbg.entity;

import java.io.Serializable;
import lombok.Data;

@Data
public class SmsCouponProductCategoryRelation implements Serializable {
    private Long id;

    private Long couponId;

    private Long productCategoryId;

    /** 产品分类名称 **/
    private String productCategoryName;

    /** 父分类名称 **/
    private String parentCategoryName;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", couponId=").append(couponId);
        sb.append(", productCategoryId=").append(productCategoryId);
        sb.append(", productCategoryName=").append(productCategoryName);
        sb.append(", parentCategoryName=").append(parentCategoryName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}