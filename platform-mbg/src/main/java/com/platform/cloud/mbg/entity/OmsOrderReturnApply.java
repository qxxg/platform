package com.platform.cloud.mbg.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

@Data
public class OmsOrderReturnApply implements Serializable {
    private Long id;

    /** 订单id **/
    private Long orderId;

    /** 收货地址表id **/
    private Long companyAddressId;

    /** 退货商品id **/
    private Long productId;

    /** 订单编号 **/
    private String orderSn;

    /** 申请时间 **/
    private Date createTime;

    /** 会员用户名 **/
    private String memberUsername;

    /** 退款金额 **/
    private BigDecimal returnAmount;

    /** 退货人姓名 **/
    private String returnName;

    /** 退货人电话 **/
    private String returnPhone;

    /** 申请状态：0->待处理；1->退货中；2->已完成；3->已拒绝 **/
    private Integer status;

    /** 处理时间 **/
    private Date handleTime;

    /** 商品图片 **/
    private String productPic;

    /** 商品名称 **/
    private String productName;

    /** 商品品牌 **/
    private String productBrand;

    /** 商品销售属性：颜色：红色；尺码：xl; **/
    private String productAttr;

    /** 退货数量 **/
    private Integer productCount;

    /** 商品单价 **/
    private BigDecimal productPrice;

    /** 商品实际支付单价 **/
    private BigDecimal productRealPrice;

    /** 原因 **/
    private String reason;

    /** 描述 **/
    private String description;

    /** 凭证图片，以逗号隔开 **/
    private String proofPics;

    /** 处理备注 **/
    private String handleNote;

    /** 处理人员 **/
    private String handleMan;

    /** 收货人 **/
    private String receiveMan;

    /** 收货时间 **/
    private Date receiveTime;

    /** 收货备注 **/
    private String receiveNote;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderId=").append(orderId);
        sb.append(", companyAddressId=").append(companyAddressId);
        sb.append(", productId=").append(productId);
        sb.append(", orderSn=").append(orderSn);
        sb.append(", createTime=").append(createTime);
        sb.append(", memberUsername=").append(memberUsername);
        sb.append(", returnAmount=").append(returnAmount);
        sb.append(", returnName=").append(returnName);
        sb.append(", returnPhone=").append(returnPhone);
        sb.append(", status=").append(status);
        sb.append(", handleTime=").append(handleTime);
        sb.append(", productPic=").append(productPic);
        sb.append(", productName=").append(productName);
        sb.append(", productBrand=").append(productBrand);
        sb.append(", productAttr=").append(productAttr);
        sb.append(", productCount=").append(productCount);
        sb.append(", productPrice=").append(productPrice);
        sb.append(", productRealPrice=").append(productRealPrice);
        sb.append(", reason=").append(reason);
        sb.append(", description=").append(description);
        sb.append(", proofPics=").append(proofPics);
        sb.append(", handleNote=").append(handleNote);
        sb.append(", handleMan=").append(handleMan);
        sb.append(", receiveMan=").append(receiveMan);
        sb.append(", receiveTime=").append(receiveTime);
        sb.append(", receiveNote=").append(receiveNote);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}