package com.qf.mapper;

import com.qf.entity.Order;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
* @author 75494
* @description 针对表【order】的数据库操作Mapper
* @createDate 2022-07-12 08:46:19
* @Entity com.qf.entity.Order
*/
@Mapper
public interface OrderMapper extends BaseMapper<Order> {

}




