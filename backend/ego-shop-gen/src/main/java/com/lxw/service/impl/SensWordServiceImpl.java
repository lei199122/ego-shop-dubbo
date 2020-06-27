package com.lxw.service.impl;

import com.lxw.entity.SensWord;
import com.lxw.mapper.SensWordMapper;
import com.lxw.service.SensWordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 敏感字过滤表 服务实现类
 * </p>
 *
 * @author liangtiandong
 * @since 2020-06-27
 */
@Service
public class SensWordServiceImpl extends ServiceImpl<SensWordMapper, SensWord> implements SensWordService {

}
