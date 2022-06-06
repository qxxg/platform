package com.platform.cloud.mbg.entity;

import java.io.Serializable;
import lombok.Data;

@Data
public class CmsPrefrenceArea implements Serializable {
    private Long id;

    private String name;

    private String subTitle;

    private Integer sort;

    private Integer showStatus;

    /** 展示图片 **/
    private byte[] pic;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", subTitle=").append(subTitle);
        sb.append(", sort=").append(sort);
        sb.append(", showStatus=").append(showStatus);
        sb.append(", pic=").append(pic);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}