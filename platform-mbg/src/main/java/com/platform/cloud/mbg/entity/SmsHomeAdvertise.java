package com.platform.cloud.mbg.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class SmsHomeAdvertise implements Serializable {
    private Long id;

    private String name;

    /** 轮播位置：0->PC首页轮播；1->app首页轮播 **/
    private Integer type;

    private String pic;

    private Date startTime;

    private Date endTime;

    /** 上下线状态：0->下线；1->上线 **/
    private Integer status;

    /** 点击数 **/
    private Integer clickCount;

    /** 下单数 **/
    private Integer orderCount;

    /** 链接地址 **/
    private String url;

    /** 备注 **/
    private String note;

    /** 排序 **/
    private Integer sort;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", type=").append(type);
        sb.append(", pic=").append(pic);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", status=").append(status);
        sb.append(", clickCount=").append(clickCount);
        sb.append(", orderCount=").append(orderCount);
        sb.append(", url=").append(url);
        sb.append(", note=").append(note);
        sb.append(", sort=").append(sort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}