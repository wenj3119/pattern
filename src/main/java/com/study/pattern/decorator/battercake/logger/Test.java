package com.study.pattern.decorator.battercake.logger;


import org.slf4j.Logger;

/**
 * @Author wenjun
 * @Date 2020/9/23
 * @Description
 */
public class Test {
    //private static final Logger logger = LoggerFactory.getLogger(Test.class);
    private static final Logger logger = JsonLoggerFactory.getLogger(Test.class);

    public static void main(String[] args) {
        logger.error("系统错误");
    }
}
