package com.lxw.service.impl;

import com.lxw.entity.OrderItem;
import com.lxw.mapper.OrderItemMapper;
import com.lxw.service.OrderItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单项 服务实现类
 * </p>
 *
 * @author liangtiandong
 * @since 2020-06-27
 */
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements OrderItemService {

}
