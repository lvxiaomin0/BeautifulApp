package com.qf.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qf.entity.Technician;
import com.qf.service.TechnicianService;
import com.qf.mapper.TechnicianMapper;
import org.springframework.stereotype.Service;

/**
* @author 75494
* @description 针对表【technician】的数据库操作Service实现
* @createDate 2022-07-12 08:46:41
*/
@Service
public class TechnicianServiceImpl extends ServiceImpl<TechnicianMapper, Technician>
    implements TechnicianService{

}




