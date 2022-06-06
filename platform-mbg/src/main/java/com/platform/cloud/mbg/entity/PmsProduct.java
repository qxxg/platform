package com.platform.cloud.mbg.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

@Data
public class PmsProduct implements Serializable {
    private Long id;

    private Long brandId;

    private Long productCategoryId;

    private Long feightTemplateId;

    private Long productAttributeCategoryId;

    private String name;

    private String pic;

    /** 货号 **/
    private String productSn;

    /** 删除状态：0->未删除；1->已删除 **/
    private Integer deleteStatus;

    /** 上架状态：0->下架；1->上架 **/
    private Integer publishStatus;

    /** 新品状态:0->不是新品；1->新品 **/
    private Integer newStatus;

    /** 推荐状态；0->不推荐；1->推荐 **/
    private Integer recommandStatus;

    /** 审核状态：0->未审核；1->审核通过 **/
    private Integer verifyStatus;

    /** 排序 **/
    private Integer sort;

    /** 销量 **/
    private Integer sale;

    private BigDecimal price;

    /** 促销价格 **/
    private BigDecimal promotionPrice;

    /** 赠送的成长值 **/
    private Integer giftGrowth;

    /** 赠送的积分 **/
    private Integer giftPoint;

    /** 限制使用的积分数 **/
    private Integer usePointLimit;

    /** 副标题 **/
    private String subTitle;

    /** 市场价 **/
    private BigDecimal originalPrice;

    /** 库存 **/
    private Integer stock;

    /** 库存预警值 **/
    private Integer lowStock;

    /** 单位 **/
    private String unit;

    /** 商品重量，默认为克 **/
    private BigDecimal weight;

    /** 是否为预告商品：0->不是；1->是 **/
    private Integer previewStatus;

    /** 以逗号分割的产品服务：1->无忧退货；2->快速退款；3->免费包邮 **/
    private String serviceIds;

    private String keywords;

    private String note;

    /** 画册图片，连产品图片限制为5张，以逗号分割 **/
    private String albumPics;

    private String detailTitle;

    /** 促销开始时间 **/
    private Date promotionStartTime;

    /** 促销结束时间 **/
    private Date promotionEndTime;

    /** 活动限购数量 **/
    private Integer promotionPerLimit;

    /** 促销类型：0->没有促销使用原价;1->使用促销价；2->使用会员价；3->使用阶梯价格；4->使用满减价格；5->限时购 **/
    private Integer promotionType;

    /** 品牌名称 **/
    private String brandName;

    /** 商品分类名称 **/
    private String productCategoryName;

    /** 商品描述 **/
    private String description;

    private String detailDesc;

    /** 产品详情网页内容 **/
    private String detailHtml;

    /** 移动端网页详情 **/
    private String detailMobileHtml;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", brandId=").append(brandId);
        sb.append(", productCategoryId=").append(productCategoryId);
        sb.append(", feightTemplateId=").append(feightTemplateId);
        sb.append(", productAttributeCategoryId=").append(productAttributeCategoryId);
        sb.append(", name=").append(name);
        sb.append(", pic=").append(pic);
        sb.append(", productSn=").append(productSn);
        sb.append(", deleteStatus=").append(deleteStatus);
        sb.append(", publishStatus=").append(publishStatus);
        sb.append(", newStatus=").append(newStatus);
        sb.append(", recommandStatus=").append(recommandStatus);
        sb.append(", verifyStatus=").append(verifyStatus);
        sb.append(", sort=").append(sort);
        sb.append(", sale=").append(sale);
        sb.append(", price=").append(price);
        sb.append(", promotionPrice=").append(promotionPrice);
        sb.append(", giftGrowth=").append(giftGrowth);
        sb.append(", giftPoint=").append(giftPoint);
        sb.append(", usePointLimit=").append(usePointLimit);
        sb.append(", subTitle=").append(subTitle);
        sb.append(", originalPrice=").append(originalPrice);
        sb.append(", stock=").append(stock);
        sb.append(", lowStock=").append(lowStock);
        sb.append(", unit=").append(unit);
        sb.append(", weight=").append(weight);
        sb.append(", previewStatus=").append(previewStatus);
        sb.append(", serviceIds=").append(serviceIds);
        sb.append(", keywords=").append(keywords);
        sb.append(", note=").append(note);
        sb.append(", albumPics=").append(albumPics);
        sb.append(", detailTitle=").append(detailTitle);
        sb.append(", promotionStartTime=").append(promotionStartTime);
        sb.append(", promotionEndTime=").append(promotionEndTime);
        sb.append(", promotionPerLimit=").append(promotionPerLimit);
        sb.append(", promotionType=").append(promotionType);
        sb.append(", brandName=").append(brandName);
        sb.append(", productCategoryName=").append(productCategoryName);
        sb.append(", description=").append(description);
        sb.append(", detailDesc=").append(detailDesc);
        sb.append(", detailHtml=").append(detailHtml);
        sb.append(", detailMobileHtml=").append(detailMobileHtml);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}