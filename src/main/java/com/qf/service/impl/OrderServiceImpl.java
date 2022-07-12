package com.qf.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qf.entity.Order;
import com.qf.service.OrderService;
import com.qf.mapper.OrderMapper;
import org.springframework.stereotype.Service;

/**
* @author 75494
* @description 针对表【order】的数据库操作Service实现
* @createDate 2022-07-12 08:46:19
*/
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order>
    implements OrderService{

}




