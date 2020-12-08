package com.example.demo;

import org.junit.jupiter.api.Test;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {
//  记录器
    Logger logger= LoggerFactory.getLogger(getClass());
    @Test
    void contextLoads() {
        logger.debug("这是一个debug信息");
        logger.trace("这是一个跟踪信息");
    }

}
