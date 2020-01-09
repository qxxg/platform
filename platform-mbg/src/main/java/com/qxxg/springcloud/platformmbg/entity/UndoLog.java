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
public class UndoLog implements Serializable {
    private Long id;

    private Long branchId;

    private String xid;

    private String context;

    private Integer logStatus;

    private Date logCreated;

    private Date logModified;

    private String ext;

    private byte[] rollbackInfo;

    private static final long serialVersionUID = 1L;
}