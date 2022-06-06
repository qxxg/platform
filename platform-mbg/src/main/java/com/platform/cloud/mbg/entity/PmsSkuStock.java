package com.platform.cloud.mbg.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

@Data
public class PmsSkuStock implements Serializable {
    private Long id;

    private Long productId;

    /** sku编码 **/
    private String skuCode;

    private BigDecimal price;

    /** 库存 **/
    private Integer stock;

    /** 预警库存 **/
    private Integer lowStock;

    /** 展示图片 **/
    private String pic;

    /** 销量 **/
    private Integer sale;

    /** 单品促销价格 **/
    private BigDecimal promotionPrice;

    /** 锁定库存 **/
    private Integer lockStock;

    /** 商品销售属性，json格式 **/
    private String spData;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productId=").append(productId);
        sb.append(", skuCode=").append(skuCode);
        sb.append(", price=").append(price);
        sb.append(", stock=").append(stock);
        sb.append(", lowStock=").append(lowStock);
        sb.append(", pic=").append(pic);
        sb.append(", sale=").append(sale);
        sb.append(", promotionPrice=").append(promotionPrice);
        sb.append(", lockStock=").append(lockStock);
        sb.append(", spData=").append(spData);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}