package com.qxxg.springcloud.platformmbg.service.impl;

import com.qxxg.springcloud.platformmbg.entity.Log;
import com.qxxg.springcloud.platformmbg.mapper.LogMapper;
import com.qxxg.springcloud.platformmbg.service.LogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author smallsand
 * @since 2019-11-20
 */
@Service
public class LogServiceImpl extends ServiceImpl<LogMapper, Log> implements LogService {

}
