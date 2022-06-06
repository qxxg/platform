package com.platform.cloud.mbg.entity;

import java.io.Serializable;
import lombok.Data;

@Data
public class UmsMemberTask implements Serializable {
    private Long id;

    private String name;

    /** 赠送成长值 **/
    private Integer growth;

    /** 赠送积分 **/
    private Integer intergration;

    /** 任务类型：0->新手任务；1->日常任务 **/
    private Integer type;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", growth=").append(growth);
        sb.append(", intergration=").append(intergration);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}