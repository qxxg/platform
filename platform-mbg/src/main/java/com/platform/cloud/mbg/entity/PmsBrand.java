package com.platform.cloud.mbg.entity;

import java.io.Serializable;
import lombok.Data;

@Data
public class PmsBrand implements Serializable {
    private Long id;

    private String name;

    /** 首字母 **/
    private String firstLetter;

    private Integer sort;

    /** 是否为品牌制造商：0->不是；1->是 **/
    private Integer factoryStatus;

    private Integer showStatus;

    /** 产品数量 **/
    private Integer productCount;

    /** 产品评论数量 **/
    private Integer productCommentCount;

    /** 品牌logo **/
    private String logo;

    /** 专区大图 **/
    private String bigPic;

    /** 品牌故事 **/
    private String brandStory;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", firstLetter=").append(firstLetter);
        sb.append(", sort=").append(sort);
        sb.append(", factoryStatus=").append(factoryStatus);
        sb.append(", showStatus=").append(showStatus);
        sb.append(", productCount=").append(productCount);
        sb.append(", productCommentCount=").append(productCommentCount);
        sb.append(", logo=").append(logo);
        sb.append(", bigPic=").append(bigPic);
        sb.append(", brandStory=").append(brandStory);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}