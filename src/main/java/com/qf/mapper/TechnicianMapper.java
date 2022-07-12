package com.qf.mapper;

import com.qf.entity.Technician;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
* @author 75494
* @description 针对表【technician】的数据库操作Mapper
* @createDate 2022-07-12 08:46:41
* @Entity com.qf.entity.Technician
*/
@Mapper
public interface TechnicianMapper extends BaseMapper<Technician> {

}




