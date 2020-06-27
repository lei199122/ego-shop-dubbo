package com.lxw.service.impl;

import com.lxw.entity.ScheduleJob;
import com.lxw.mapper.ScheduleJobMapper;
import com.lxw.service.ScheduleJobService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 定时任务 服务实现类
 * </p>
 *
 * @author liangtiandong
 * @since 2020-06-27
 */
@Service
public class ScheduleJobServiceImpl extends ServiceImpl<ScheduleJobMapper, ScheduleJob> implements ScheduleJobService {

}
