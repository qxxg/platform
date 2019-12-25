package com.qxxg.springcloud.platformes.service.impl;

import com.qxxg.springcloud.platformes.repository.EsProductRepository;
import com.qxxg.springcloud.platformes.service.EsService;
import com.qxxg.springcloud.platformmbg.entity.WebLogAop;
import com.qxxg.springcloud.platformmbg.entity.WebLogAopExample;
import com.qxxg.springcloud.platformmbg.mapper.WebLogAopMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

/**
 * @Author: smallsand
 * @Date: 2019/12/12 16:30
 */
@Service
public class EsServiceImpl implements EsService {
    @Autowired
    private EsProductRepository productRepository;

    @Autowired
    private WebLogAopMapper webLogAopMapper;

    public int infoEs(){
        WebLogAopExample wlae = new WebLogAopExample();
        List<WebLogAop> webLogAops = webLogAopMapper.selectByExample(wlae);
        Iterable<WebLogAop> iterators = productRepository.saveAll(webLogAops);
        Iterator<WebLogAop> iterator = iterators.iterator();
        int result = 0;
        while (iterator.hasNext()) {
            result++;
            iterator.next();
        }
        return result;
    }

}
