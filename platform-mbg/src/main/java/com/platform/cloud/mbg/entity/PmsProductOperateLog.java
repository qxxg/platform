package com.platform.cloud.mbg.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

@Data
public class PmsProductOperateLog implements Serializable {
    private Long id;

    private Long productId;

    private BigDecimal priceOld;

    private BigDecimal priceNew;

    private BigDecimal salePriceOld;

    private BigDecimal salePriceNew;

    /** 赠送的积分 **/
    private Integer giftPointOld;

    private Integer giftPointNew;

    private Integer usePointLimitOld;

    private Integer usePointLimitNew;

    /** 操作人 **/
    private String operateMan;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productId=").append(productId);
        sb.append(", priceOld=").append(priceOld);
        sb.append(", priceNew=").append(priceNew);
        sb.append(", salePriceOld=").append(salePriceOld);
        sb.append(", salePriceNew=").append(salePriceNew);
        sb.append(", giftPointOld=").append(giftPointOld);
        sb.append(", giftPointNew=").append(giftPointNew);
        sb.append(", usePointLimitOld=").append(usePointLimitOld);
        sb.append(", usePointLimitNew=").append(usePointLimitNew);
        sb.append(", operateMan=").append(operateMan);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}