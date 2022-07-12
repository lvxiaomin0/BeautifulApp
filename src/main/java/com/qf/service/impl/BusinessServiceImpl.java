package com.qf.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qf.entity.Business;
import com.qf.service.BusinessService;
import com.qf.mapper.BusinessMapper;
import org.springframework.stereotype.Service;

/**
* @author 75494
* @description 针对表【business】的数据库操作Service实现
* @createDate 2022-07-12 08:46:10
*/
@Service
public class BusinessServiceImpl extends ServiceImpl<BusinessMapper, Business> implements BusinessService{

}




