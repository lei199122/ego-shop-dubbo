package com.lxw.service.impl;

import com.lxw.entity.Order;
import com.lxw.mapper.OrderMapper;
import com.lxw.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author liangtiandong
 * @since 2020-06-27
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
