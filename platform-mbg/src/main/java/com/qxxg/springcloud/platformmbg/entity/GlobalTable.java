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
public class GlobalTable implements Serializable {
    private String xid;

    private Long transactionId;

    private Byte status;

    private String applicationId;

    private String transactionServiceGroup;

    private String transactionName;

    private Integer timeout;

    private Long beginTime;

    private String applicationData;

    private Date gmtCreate;

    private Date gmtModified;

    private static final long serialVersionUID = 1L;
}