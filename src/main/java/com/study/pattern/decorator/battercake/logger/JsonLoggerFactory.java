package com.study.pattern.decorator.battercake.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author wenjun
 * @Date 2020/9/23
 * @Description
 */
public class JsonLoggerFactory {
    public static JsonLogger getLogger(Class clazz){
        Logger logger = LoggerFactory.getLogger(clazz);
        return new JsonLogger(logger);
    }
}
