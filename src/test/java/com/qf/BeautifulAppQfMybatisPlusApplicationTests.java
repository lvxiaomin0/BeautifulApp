package com.qf;

import com.qf.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class BeautifulAppQfMybatisPlusApplicationTests {
    @Resource
    UserMapper userMapper;
    @Test
    void contextLoads() {
         userMapper.selectList(null).forEach(System.out::println);

    }

}
