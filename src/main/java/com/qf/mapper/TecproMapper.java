package com.qf.mapper;

import com.qf.entity.Tecpro;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
* @author 75494
* @description 针对表【tecpro】的数据库操作Mapper
* @createDate 2022-07-12 08:46:44
* @Entity com.qf.entity.Tecpro
*/
@Mapper
public interface TecproMapper extends BaseMapper<Tecpro> {

}




