package com.platform.cloud.mbg.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class CmsMemberReport implements Serializable {
    private Long id;

    /** 举报类型：0->商品评价；1->话题内容；2->用户评论 **/
    private Integer reportType;

    /** 举报人 **/
    private String reportMemberName;

    private Date createTime;

    private String reportObject;

    /** 举报状态：0->未处理；1->已处理 **/
    private Integer reportStatus;

    /** 处理结果：0->无效；1->有效；2->恶意 **/
    private Integer handleStatus;

    private String note;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", reportType=").append(reportType);
        sb.append(", reportMemberName=").append(reportMemberName);
        sb.append(", createTime=").append(createTime);
        sb.append(", reportObject=").append(reportObject);
        sb.append(", reportStatus=").append(reportStatus);
        sb.append(", handleStatus=").append(handleStatus);
        sb.append(", note=").append(note);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}