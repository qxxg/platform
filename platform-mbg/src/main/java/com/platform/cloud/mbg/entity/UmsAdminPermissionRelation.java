package com.platform.cloud.mbg.entity;

import java.io.Serializable;
import lombok.Data;

@Data
public class UmsAdminPermissionRelation implements Serializable {
    private Long id;

    private Long adminId;

    private Long permissionId;

    private Integer type;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", adminId=").append(adminId);
        sb.append(", permissionId=").append(permissionId);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}