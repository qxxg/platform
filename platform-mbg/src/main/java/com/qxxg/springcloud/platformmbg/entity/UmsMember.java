package com.qxxg.springcloud.platformmbg.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 会员表
 * </p>
 *
 * @author smallsand
 * @since 2019-11-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("ums_member")
@ApiModel(value="UmsMember对象", description="会员表")
public class UmsMember implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @TableField("member_level_id")
    private Long memberLevelId;

    @ApiModelProperty(value = "用户名")
    @TableField("username")
    private String username;

    @ApiModelProperty(value = "密码")
    @TableField("password")
    private String password;

    @ApiModelProperty(value = "昵称")
    @TableField("nickname")
    private String nickname;

    @ApiModelProperty(value = "手机号码")
    @TableField("phone")
    private String phone;

    @ApiModelProperty(value = "帐号启用状态:0->禁用；1->启用")
    @TableField("status")
    private Integer status;

    @ApiModelProperty(value = "注册时间")
    @TableField("create_time")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "头像")
    @TableField("icon")
    private String icon;

    @ApiModelProperty(value = "性别：0->未知；1->男；2->女")
    @TableField("gender")
    private Integer gender;

    @ApiModelProperty(value = "生日")
    @TableField("birthday")
    private LocalDate birthday;

    @ApiModelProperty(value = "所做城市")
    @TableField("city")
    private String city;

    @ApiModelProperty(value = "职业")
    @TableField("job")
    private String job;

    @ApiModelProperty(value = "个性签名")
    @TableField("personalized_signature")
    private String personalizedSignature;

    @ApiModelProperty(value = "用户来源")
    @TableField("source_type")
    private Integer sourceType;

    @ApiModelProperty(value = "积分")
    @TableField("integration")
    private Integer integration;

    @ApiModelProperty(value = "成长值")
    @TableField("growth")
    private Integer growth;

    @ApiModelProperty(value = "剩余抽奖次数")
    @TableField("luckey_count")
    private Integer luckeyCount;

    @ApiModelProperty(value = "历史积分数量")
    @TableField("history_integration")
    private Integer historyIntegration;


}
