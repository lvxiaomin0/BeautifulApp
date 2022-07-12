package com.qf.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qf.entity.User;
import com.qf.service.UserService;
import com.qf.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author 75494
* @description 针对表【user】的数据库操作Service实现
* @createDate 2022-07-12 08:46:47
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




