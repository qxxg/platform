package com.platform.cloud.mbg.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class UmsMember implements Serializable {
    private Long id;

    private Long memberLevelId;

    /** 用户名 **/
    private String username;

    /** 密码 **/
    private String password;

    /** 昵称 **/
    private String nickname;

    /** 手机号码 **/
    private String phone;

    /** 帐号启用状态:0->禁用；1->启用 **/
    private Integer status;

    /** 注册时间 **/
    private Date createTime;

    /** 头像 **/
    private String icon;

    /** 性别：0->未知；1->男；2->女 **/
    private Integer gender;

    /** 生日 **/
    private Date birthday;

    /** 所做城市 **/
    private String city;

    /** 职业 **/
    private String job;

    /** 个性签名 **/
    private String personalizedSignature;

    /** 用户来源 **/
    private Integer sourceType;

    /** 积分 **/
    private Integer integration;

    /** 成长值 **/
    private Integer growth;

    /** 剩余抽奖次数 **/
    private Integer luckeyCount;

    /** 历史积分数量 **/
    private Integer historyIntegration;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", memberLevelId=").append(memberLevelId);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", nickname=").append(nickname);
        sb.append(", phone=").append(phone);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", icon=").append(icon);
        sb.append(", gender=").append(gender);
        sb.append(", birthday=").append(birthday);
        sb.append(", city=").append(city);
        sb.append(", job=").append(job);
        sb.append(", personalizedSignature=").append(personalizedSignature);
        sb.append(", sourceType=").append(sourceType);
        sb.append(", integration=").append(integration);
        sb.append(", growth=").append(growth);
        sb.append(", luckeyCount=").append(luckeyCount);
        sb.append(", historyIntegration=").append(historyIntegration);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}