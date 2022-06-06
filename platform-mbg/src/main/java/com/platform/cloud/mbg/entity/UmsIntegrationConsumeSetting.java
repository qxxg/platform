package com.platform.cloud.mbg.entity;

import java.io.Serializable;
import lombok.Data;

@Data
public class UmsIntegrationConsumeSetting implements Serializable {
    private Long id;

    /** 每一元需要抵扣的积分数量 **/
    private Integer deductionPerAmount;

    /** 每笔订单最高抵用百分比 **/
    private Integer maxPercentPerOrder;

    /** 每次使用积分最小单位100 **/
    private Integer useUnit;

    /** 是否可以和优惠券同用；0->不可以；1->可以 **/
    private Integer couponStatus;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", deductionPerAmount=").append(deductionPerAmount);
        sb.append(", maxPercentPerOrder=").append(maxPercentPerOrder);
        sb.append(", useUnit=").append(useUnit);
        sb.append(", couponStatus=").append(couponStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}