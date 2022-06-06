package com.platform.cloud.mbg.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class PmsComment implements Serializable {
    private Long id;

    private Long productId;

    private String memberNickName;

    private String productName;

    /** 评价星数：0->5 **/
    private Integer star;

    /** 评价的ip **/
    private String memberIp;

    private Date createTime;

    private Integer showStatus;

    /** 购买时的商品属性 **/
    private String productAttribute;

    private Integer collectCouont;

    private Integer readCount;

    /** 上传图片地址，以逗号隔开 **/
    private String pics;

    /** 评论用户头像 **/
    private String memberIcon;

    private Integer replayCount;

    private String content;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productId=").append(productId);
        sb.append(", memberNickName=").append(memberNickName);
        sb.append(", productName=").append(productName);
        sb.append(", star=").append(star);
        sb.append(", memberIp=").append(memberIp);
        sb.append(", createTime=").append(createTime);
        sb.append(", showStatus=").append(showStatus);
        sb.append(", productAttribute=").append(productAttribute);
        sb.append(", collectCouont=").append(collectCouont);
        sb.append(", readCount=").append(readCount);
        sb.append(", pics=").append(pics);
        sb.append(", memberIcon=").append(memberIcon);
        sb.append(", replayCount=").append(replayCount);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}