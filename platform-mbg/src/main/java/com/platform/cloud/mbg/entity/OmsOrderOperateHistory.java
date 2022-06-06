package com.platform.cloud.mbg.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class OmsOrderOperateHistory implements Serializable {
    private Long id;

    /** 订单id **/
    private Long orderId;

    /** 操作人：用户；系统；后台管理员 **/
    private String operateMan;

    /** 操作时间 **/
    private Date createTime;

    /** 订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单 **/
    private Integer orderStatus;

    /** 备注 **/
    private String note;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderId=").append(orderId);
        sb.append(", operateMan=").append(operateMan);
        sb.append(", createTime=").append(createTime);
        sb.append(", orderStatus=").append(orderStatus);
        sb.append(", note=").append(note);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}