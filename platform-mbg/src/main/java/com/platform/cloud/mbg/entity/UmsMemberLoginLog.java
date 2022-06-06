package com.platform.cloud.mbg.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class UmsMemberLoginLog implements Serializable {
    private Long id;

    private Long memberId;

    private Date createTime;

    private String ip;

    private String city;

    /** 登录类型：0->PC；1->android;2->ios;3->小程序 **/
    private Integer loginType;

    private String province;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", memberId=").append(memberId);
        sb.append(", createTime=").append(createTime);
        sb.append(", ip=").append(ip);
        sb.append(", city=").append(city);
        sb.append(", loginType=").append(loginType);
        sb.append(", province=").append(province);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}