package com.platform.cloud.mbg.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

@Data
public class PmsFeightTemplate implements Serializable {
    private Long id;

    private String name;

    /** 计费类型:0->按重量；1->按件数 **/
    private Integer chargeType;

    /** 首重kg **/
    private BigDecimal firstWeight;

    /** 首费（元） **/
    private BigDecimal firstFee;

    private BigDecimal continueWeight;

    private BigDecimal continmeFee;

    /** 目的地（省、市） **/
    private String dest;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", chargeType=").append(chargeType);
        sb.append(", firstWeight=").append(firstWeight);
        sb.append(", firstFee=").append(firstFee);
        sb.append(", continueWeight=").append(continueWeight);
        sb.append(", continmeFee=").append(continmeFee);
        sb.append(", dest=").append(dest);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}