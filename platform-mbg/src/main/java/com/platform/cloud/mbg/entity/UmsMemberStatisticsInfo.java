package com.platform.cloud.mbg.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

@Data
public class UmsMemberStatisticsInfo implements Serializable {
    private Long id;

    private Long memberId;

    /** 累计消费金额 **/
    private BigDecimal consumeAmount;

    /** 订单数量 **/
    private Integer orderCount;

    /** 优惠券数量 **/
    private Integer couponCount;

    /** 评价数 **/
    private Integer commentCount;

    /** 退货数量 **/
    private Integer returnOrderCount;

    /** 登录次数 **/
    private Integer loginCount;

    /** 关注数量 **/
    private Integer attendCount;

    /** 粉丝数量 **/
    private Integer fansCount;

    private Integer collectProductCount;

    private Integer collectSubjectCount;

    private Integer collectTopicCount;

    private Integer collectCommentCount;

    private Integer inviteFriendCount;

    /** 最后一次下订单时间 **/
    private Date recentOrderTime;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", memberId=").append(memberId);
        sb.append(", consumeAmount=").append(consumeAmount);
        sb.append(", orderCount=").append(orderCount);
        sb.append(", couponCount=").append(couponCount);
        sb.append(", commentCount=").append(commentCount);
        sb.append(", returnOrderCount=").append(returnOrderCount);
        sb.append(", loginCount=").append(loginCount);
        sb.append(", attendCount=").append(attendCount);
        sb.append(", fansCount=").append(fansCount);
        sb.append(", collectProductCount=").append(collectProductCount);
        sb.append(", collectSubjectCount=").append(collectSubjectCount);
        sb.append(", collectTopicCount=").append(collectTopicCount);
        sb.append(", collectCommentCount=").append(collectCommentCount);
        sb.append(", inviteFriendCount=").append(inviteFriendCount);
        sb.append(", recentOrderTime=").append(recentOrderTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}