package com.platform.cloud.mbg.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class CmsTopicComment implements Serializable {
    private Long id;

    private String memberNickName;

    private Long topicId;

    private String memberIcon;

    private String content;

    private Date createTime;

    private Integer showStatus;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", memberNickName=").append(memberNickName);
        sb.append(", topicId=").append(topicId);
        sb.append(", memberIcon=").append(memberIcon);
        sb.append(", content=").append(content);
        sb.append(", createTime=").append(createTime);
        sb.append(", showStatus=").append(showStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}