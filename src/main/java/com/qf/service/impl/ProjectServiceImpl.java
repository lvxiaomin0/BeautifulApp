package com.qf.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qf.entity.Project;
import com.qf.service.ProjectService;
import com.qf.mapper.ProjectMapper;
import org.springframework.stereotype.Service;

/**
* @author 75494
* @description 针对表【project】的数据库操作Service实现
* @createDate 2022-07-12 08:46:23
*/
@Service
public class ProjectServiceImpl extends ServiceImpl<ProjectMapper, Project>
    implements ProjectService{

}




