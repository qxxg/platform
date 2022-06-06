package com.platform.cloud.mbg.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

@Data
public class UmsMemberLevel implements Serializable {
    private Long id;

    private String name;

    private Integer growthPoint;

    /** 是否为默认等级：0->不是；1->是 **/
    private Integer defaultStatus;

    /** 免运费标准 **/
    private BigDecimal freeFreightPoint;

    /** 每次评价获取的成长值 **/
    private Integer commentGrowthPoint;

    /** 是否有免邮特权 **/
    private Integer priviledgeFreeFreight;

    /** 是否有签到特权 **/
    private Integer priviledgeSignIn;

    /** 是否有评论获奖励特权 **/
    private Integer priviledgeComment;

    /** 是否有专享活动特权 **/
    private Integer priviledgePromotion;

    /** 是否有会员价格特权 **/
    private Integer priviledgeMemberPrice;

    /** 是否有生日特权 **/
    private Integer priviledgeBirthday;

    private String note;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", growthPoint=").append(growthPoint);
        sb.append(", defaultStatus=").append(defaultStatus);
        sb.append(", freeFreightPoint=").append(freeFreightPoint);
        sb.append(", commentGrowthPoint=").append(commentGrowthPoint);
        sb.append(", priviledgeFreeFreight=").append(priviledgeFreeFreight);
        sb.append(", priviledgeSignIn=").append(priviledgeSignIn);
        sb.append(", priviledgeComment=").append(priviledgeComment);
        sb.append(", priviledgePromotion=").append(priviledgePromotion);
        sb.append(", priviledgeMemberPrice=").append(priviledgeMemberPrice);
        sb.append(", priviledgeBirthday=").append(priviledgeBirthday);
        sb.append(", note=").append(note);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}