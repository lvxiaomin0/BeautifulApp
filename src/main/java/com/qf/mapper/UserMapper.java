package com.qf.mapper;

import com.qf.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
* @author 75494
* @description 针对表【user】的数据库操作Mapper
* @createDate 2022-07-12 08:46:47
* @Entity com.qf.entity.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




