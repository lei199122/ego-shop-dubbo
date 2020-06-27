package com.lxw.service.impl;

import com.lxw.entity.LoginHist;
import com.lxw.mapper.LoginHistMapper;
import com.lxw.service.LoginHistService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 登录历史表 服务实现类
 * </p>
 *
 * @author liangtiandong
 * @since 2020-06-27
 */
@Service
public class LoginHistServiceImpl extends ServiceImpl<LoginHistMapper, LoginHist> implements LoginHistService {

}
