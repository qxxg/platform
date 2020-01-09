package com.qxxg.springcloud.platformseatab.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
* Created by Mybatis Generator on 2019/12/10
*/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UmsRole implements Serializable {
    private Long id;

    private String name;

    private String description;

    private Integer adminCount;

    private Date createTime;

    private Integer status;

    private Integer sort;

    private static final long serialVersionUID = 1L;
}