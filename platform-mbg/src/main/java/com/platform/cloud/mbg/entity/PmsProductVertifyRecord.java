package com.platform.cloud.mbg.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class PmsProductVertifyRecord implements Serializable {
    private Long id;

    private Long productId;

    private Date createTime;

    /** 审核人 **/
    private String vertifyMan;

    private Integer status;

    /** 反馈详情 **/
    private String detail;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productId=").append(productId);
        sb.append(", createTime=").append(createTime);
        sb.append(", vertifyMan=").append(vertifyMan);
        sb.append(", status=").append(status);
        sb.append(", detail=").append(detail);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}