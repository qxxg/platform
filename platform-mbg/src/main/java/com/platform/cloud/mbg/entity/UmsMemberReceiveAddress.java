package com.platform.cloud.mbg.entity;

import java.io.Serializable;
import lombok.Data;

@Data
public class UmsMemberReceiveAddress implements Serializable {
    private Long id;

    private Long memberId;

    /** 收货人名称 **/
    private String name;

    private String phoneNumber;

    /** 是否为默认 **/
    private Integer defaultStatus;

    /** 邮政编码 **/
    private String postCode;

    /** 省份/直辖市 **/
    private String province;

    /** 城市 **/
    private String city;

    /** 区 **/
    private String region;

    /** 详细地址(街道) **/
    private String detailAddress;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", memberId=").append(memberId);
        sb.append(", name=").append(name);
        sb.append(", phoneNumber=").append(phoneNumber);
        sb.append(", defaultStatus=").append(defaultStatus);
        sb.append(", postCode=").append(postCode);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", region=").append(region);
        sb.append(", detailAddress=").append(detailAddress);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}