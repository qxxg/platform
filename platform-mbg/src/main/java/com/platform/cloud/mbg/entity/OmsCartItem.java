package com.platform.cloud.mbg.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

@Data
public class OmsCartItem implements Serializable {
    private Long id;

    private Long productId;

    private Long productSkuId;

    private Long memberId;

    /** 购买数量 **/
    private Integer quantity;

    /** 添加到购物车的价格 **/
    private BigDecimal price;

    /** 商品主图 **/
    private String productPic;

    /** 商品名称 **/
    private String productName;

    /** 商品副标题（卖点） **/
    private String productSubTitle;

    /** 商品sku条码 **/
    private String productSkuCode;

    /** 会员昵称 **/
    private String memberNickname;

    /** 创建时间 **/
    private Date createDate;

    /** 修改时间 **/
    private Date modifyDate;

    /** 是否删除 **/
    private Integer deleteStatus;

    /** 商品分类 **/
    private Long productCategoryId;

    private String productBrand;

    private String productSn;

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
        sb.append(", productId=").append(productId);
        sb.append(", productSkuId=").append(productSkuId);
        sb.append(", memberId=").append(memberId);
        sb.append(", quantity=").append(quantity);
        sb.append(", price=").append(price);
        sb.append(", productPic=").append(productPic);
        sb.append(", productName=").append(productName);
        sb.append(", productSubTitle=").append(productSubTitle);
        sb.append(", productSkuCode=").append(productSkuCode);
        sb.append(", memberNickname=").append(memberNickname);
        sb.append(", createDate=").append(createDate);
        sb.append(", modifyDate=").append(modifyDate);
        sb.append(", deleteStatus=").append(deleteStatus);
        sb.append(", productCategoryId=").append(productCategoryId);
        sb.append(", productBrand=").append(productBrand);
        sb.append(", productSn=").append(productSn);
        sb.append(", productAttr=").append(productAttr);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}