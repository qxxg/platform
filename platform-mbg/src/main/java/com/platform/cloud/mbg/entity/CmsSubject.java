package com.platform.cloud.mbg.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class CmsSubject implements Serializable {
    private Long id;

    private Long categoryId;

    private String title;

    /** 专题主图 **/
    private String pic;

    /** 关联产品数量 **/
    private Integer productCount;

    private Integer recommendStatus;

    private Date createTime;

    private Integer collectCount;

    private Integer readCount;

    private Integer commentCount;

    /** 画册图片用逗号分割 **/
    private String albumPics;

    private String description;

    /** 显示状态：0->不显示；1->显示 **/
    private Integer showStatus;

    /** 转发数 **/
    private Integer forwardCount;

    /** 专题分类名称 **/
    private String categoryName;

    private String content;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", title=").append(title);
        sb.append(", pic=").append(pic);
        sb.append(", productCount=").append(productCount);
        sb.append(", recommendStatus=").append(recommendStatus);
        sb.append(", createTime=").append(createTime);
        sb.append(", collectCount=").append(collectCount);
        sb.append(", readCount=").append(readCount);
        sb.append(", commentCount=").append(commentCount);
        sb.append(", albumPics=").append(albumPics);
        sb.append(", description=").append(description);
        sb.append(", showStatus=").append(showStatus);
        sb.append(", forwardCount=").append(forwardCount);
        sb.append(", categoryName=").append(categoryName);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}