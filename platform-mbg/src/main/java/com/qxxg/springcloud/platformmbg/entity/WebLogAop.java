package com.qxxg.springcloud.platformmbg.entity;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
* Created by Mybatis Generator on 2019/12/10
*/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "platform",type = "web_log_aop",shards = 1,replicas = 0)
public class WebLogAop implements Serializable {
    @Id
    private Long id;

    @Field(analyzer = "ik_max_word",type = FieldType.Text)
    private String description;

    @Field(type = FieldType.Keyword)
    private String username;


    private Long startTime;

    private Integer spendTime;

    private String basePath;
    @Field(type = FieldType.Keyword)
    private String uri;

    @Field(index = false)
    private String url;
    @Field(type = FieldType.Keyword)
    private String method;
    @Field(type = FieldType.Ip)
    private String ip;

    private String parameter;

    private String result;

    private static final long serialVersionUID = 1L;
}