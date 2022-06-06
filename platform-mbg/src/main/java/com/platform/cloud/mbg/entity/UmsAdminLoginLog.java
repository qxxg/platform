package com.platform.cloud.mbg.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class UmsAdminLoginLog implements Serializable {
    private Long id;

    private Long adminId;

    private Date createTime;

    private String ip;

    private String address;

    /** 浏览器登录类型 **/
    private String userAgent;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", adminId=").append(adminId);
        sb.append(", createTime=").append(createTime);
        sb.append(", ip=").append(ip);
        sb.append(", address=").append(address);
        sb.append(", userAgent=").append(userAgent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}