package com.platform.cloud.mbg.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class UmsIntegrationChangeHistory implements Serializable {
    private Long id;

    private Long memberId;

    private Date createTime;

    /** 改变类型：0->增加；1->减少 **/
    private Integer changeType;

    /** 积分改变数量 **/
    private Integer changeCount;

    /** 操作人员 **/
    private String operateMan;

    /** 操作备注 **/
    private String operateNote;

    /** 积分来源：0->购物；1->管理员修改 **/
    private Integer sourceType;

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
        sb.append(", changeType=").append(changeType);
        sb.append(", changeCount=").append(changeCount);
        sb.append(", operateMan=").append(operateMan);
        sb.append(", operateNote=").append(operateNote);
        sb.append(", sourceType=").append(sourceType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}