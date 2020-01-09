package com.qxxg.springcloud.platformmbg.entity;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* Created by Mybatis Generator on 2019/12/10
*/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BranchTable implements Serializable {
    private Long branchId;

    private String xid;

    private Long transactionId;

    private String resourceGroupId;

    private String resourceId;

    private String lockKey;

    private String branchType;

    private Byte status;

    private String clientId;

    private String applicationData;

    private Date gmtCreate;

    private Date gmtModified;

    private static final long serialVersionUID = 1L;
}