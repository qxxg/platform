package com.platform.cloud.mbg.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class SmsCouponHistory implements Serializable {
    private Long id;

    private Long couponId;

    private Long memberId;

    private String couponCode;

    /** 领取人昵称 **/
    private String memberNickname;

    /** 获取类型：0->后台赠送；1->主动获取 **/
    private Integer getType;

    private Date createTime;

    /** 使用状态：0->未使用；1->已使用；2->已过期 **/
    private Integer useStatus;

    /** 使用时间 **/
    private Date useTime;

    /** 订单编号 **/
    private Long orderId;

    /** 订单号码 **/
    private String orderSn;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", couponId=").append(couponId);
        sb.append(", memberId=").append(memberId);
        sb.append(", couponCode=").append(couponCode);
        sb.append(", memberNickname=").append(memberNickname);
        sb.append(", getType=").append(getType);
        sb.append(", createTime=").append(createTime);
        sb.append(", useStatus=").append(useStatus);
        sb.append(", useTime=").append(useTime);
        sb.append(", orderId=").append(orderId);
        sb.append(", orderSn=").append(orderSn);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}