package com.platform.cloud.mbg.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

@Data
public class UmsMemberRuleSetting implements Serializable {
    private Long id;

    /** 连续签到天数 **/
    private Integer continueSignDay;

    /** 连续签到赠送数量 **/
    private Integer continueSignPoint;

    /** 每消费多少元获取1个点 **/
    private BigDecimal consumePerPoint;

    /** 最低获取点数的订单金额 **/
    private BigDecimal lowOrderAmount;

    /** 每笔订单最高获取点数 **/
    private Integer maxPointPerOrder;

    /** 类型：0->积分规则；1->成长值规则 **/
    private Integer type;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", continueSignDay=").append(continueSignDay);
        sb.append(", continueSignPoint=").append(continueSignPoint);
        sb.append(", consumePerPoint=").append(consumePerPoint);
        sb.append(", lowOrderAmount=").append(lowOrderAmount);
        sb.append(", maxPointPerOrder=").append(maxPointPerOrder);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}