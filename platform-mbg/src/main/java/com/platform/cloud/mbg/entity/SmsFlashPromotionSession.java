package com.platform.cloud.mbg.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class SmsFlashPromotionSession implements Serializable {
    /** 编号 **/
    private Long id;

    /** 场次名称 **/
    private String name;

    /** 每日开始时间 **/
    private Date startTime;

    /** 每日结束时间 **/
    private Date endTime;

    /** 启用状态：0->不启用；1->启用 **/
    private Integer status;

    /** 创建时间 **/
    private Date createTime;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}