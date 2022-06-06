package com.platform.cloud.mbg.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

@Data
public class SmsCoupon implements Serializable {
    private Long id;

    /** 优惠券类型；0->全场赠券；1->会员赠券；2->购物赠券；3->注册赠券 **/
    private Integer type;

    private String name;

    /** 使用平台：0->全部；1->移动；2->PC **/
    private Integer platform;

    /** 数量 **/
    private Integer count;

    /** 金额 **/
    private BigDecimal amount;

    /** 每人限领张数 **/
    private Integer perLimit;

    /** 使用门槛；0表示无门槛 **/
    private BigDecimal minPoint;

    private Date startTime;

    private Date endTime;

    /** 使用类型：0->全场通用；1->指定分类；2->指定商品 **/
    private Integer useType;

    /** 备注 **/
    private String note;

    /** 发行数量 **/
    private Integer publishCount;

    /** 已使用数量 **/
    private Integer useCount;

    /** 领取数量 **/
    private Integer receiveCount;

    /** 可以领取的日期 **/
    private Date enableTime;

    /** 优惠码 **/
    private String code;

    /** 可领取的会员类型：0->无限时 **/
    private Integer memberLevel;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", type=").append(type);
        sb.append(", name=").append(name);
        sb.append(", platform=").append(platform);
        sb.append(", count=").append(count);
        sb.append(", amount=").append(amount);
        sb.append(", perLimit=").append(perLimit);
        sb.append(", minPoint=").append(minPoint);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", useType=").append(useType);
        sb.append(", note=").append(note);
        sb.append(", publishCount=").append(publishCount);
        sb.append(", useCount=").append(useCount);
        sb.append(", receiveCount=").append(receiveCount);
        sb.append(", enableTime=").append(enableTime);
        sb.append(", code=").append(code);
        sb.append(", memberLevel=").append(memberLevel);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}