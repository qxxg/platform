package com.qxxg.springcloud.platformes.repository;

import com.qxxg.springcloud.platformmbg.entity.WebLogAop;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @Author: smallsand
 * @Date: 2019/12/12 16:37
 */
public interface EsProductRepository extends ElasticsearchRepository<WebLogAop,Long> {
}
