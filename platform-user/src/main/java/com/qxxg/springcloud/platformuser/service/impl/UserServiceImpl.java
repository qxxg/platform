package com.qxxg.springcloud.platformuser.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.qxxg.springcloud.platformuser.entity.User;
import com.qxxg.springcloud.platformuser.mapper.UserMapper;
import com.qxxg.springcloud.platformuser.service.UserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author smallsand
 * @since 2019-11-14
 */
//@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
