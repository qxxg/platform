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
public class Log implements Serializable {
    private Long id;

    private Date createTime;

    private String userName;

    private static final long serialVersionUID = 1L;
}