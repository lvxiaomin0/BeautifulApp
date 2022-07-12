package com.qf.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qf.entity.Image;
import com.qf.service.ImageService;
import com.qf.mapper.ImageMapper;
import org.springframework.stereotype.Service;

/**
* @author 75494
* @description 针对表【image】的数据库操作Service实现
* @createDate 2022-07-12 08:46:15
*/
@Service
public class ImageServiceImpl extends ServiceImpl<ImageMapper, Image>
    implements ImageService{

}




