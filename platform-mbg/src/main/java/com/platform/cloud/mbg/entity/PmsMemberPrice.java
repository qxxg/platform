package com.platform.cloud.mbg.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

@Data
public class PmsMemberPrice implements Serializable {
    private Long id;

    private Long productId;

    private Long memberLevelId;

    /** 会员价格 **/
    private BigDecimal memberPrice;

    private String memberLevelName;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productId=").append(productId);
        sb.append(", memberLevelId=").append(memberLevelId);
        sb.append(", memberPrice=").append(memberPrice);
        sb.append(", memberLevelName=").append(memberLevelName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}