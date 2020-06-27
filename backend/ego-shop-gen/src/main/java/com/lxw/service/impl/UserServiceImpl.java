package com.lxw.service.impl;

import com.lxw.entity.User;
import com.lxw.mapper.UserMapper;
import com.lxw.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author liangtiandong
 * @since 2020-06-27
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
