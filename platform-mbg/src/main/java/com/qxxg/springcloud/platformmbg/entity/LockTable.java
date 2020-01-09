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
public class LockTable implements Serializable {
    private String rowKey;

    private String xid;

    private String resourceId;

    private String tableName;

    private String pk;

    private Date gmtCreate;

    private Date gmtModified;

    private String transactionId;

    private String branchId;

    private static final long serialVersionUID = 1L;
}