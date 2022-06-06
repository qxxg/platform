package com.platform.cloud.mbg.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

@Data
public class OmsOrderItem implements Serializable {
    private Long id;

    /** 订单id **/
    private Long orderId;

    /** 订单编号 **/
    private String orderSn;

    private Long productId;

    private String productPic;

    private String productName;

    private String productBrand;

    private String productSn;

    /** 销售价格 **/
    private BigDecimal productPrice;

    /** 购买数量 **/
    private Integer productQuantity;

    /** 商品sku编号 **/
    private Long productSkuId;

    /** 商品sku条码 **/
    private String productSkuCode;

    /** 商品分类id **/
    private Long productCategoryId;

    /** 商品促销名称 **/
    private String promotionName;

    /** 商品促销分解金额 **/
    private BigDecimal promotionAmount;

    /** 优惠券优惠分解金额 **/
    private BigDecimal couponAmount;

    /** 积分优惠分解金额 **/
    private BigDecimal integrationAmount;

    /** 该商品经过优惠后的分解金额 **/
    private BigDecimal realAmount;

    private Integer giftIntegration;

    private Integer giftGrowth;

    /** 商品销售属性:[{'key':'颜色','value':'颜色'},{'key':'容量','value':'4G'}] **/
    private String productAttr;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderId=").append(orderId);
        sb.append(", orderSn=").append(orderSn);
        sb.append(", productId=").append(productId);
        sb.append(", productPic=").append(productPic);
        sb.append(", productName=").append(productName);
        sb.append(", productBrand=").append(productBrand);
        sb.append(", productSn=").append(productSn);
        sb.append(", productPrice=").append(productPrice);
        sb.append(", productQuantity=").append(productQuantity);
        sb.append(", productSkuId=").append(productSkuId);
        sb.append(", productSkuCode=").append(productSkuCode);
        sb.append(", productCategoryId=").append(productCategoryId);
        sb.append(", promotionName=").append(promotionName);
        sb.append(", promotionAmount=").append(promotionAmount);
        sb.append(", couponAmount=").append(couponAmount);
        sb.append(", integrationAmount=").append(integrationAmount);
        sb.append(", realAmount=").append(realAmount);
        sb.append(", giftIntegration=").append(giftIntegration);
        sb.append(", giftGrowth=").append(giftGrowth);
        sb.append(", productAttr=").append(productAttr);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}