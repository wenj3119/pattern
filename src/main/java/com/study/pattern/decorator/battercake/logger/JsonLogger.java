package com.study.pattern.decorator.battercake.logger;

import net.sf.json.JSONObject;
import netscape.javascript.JSObject;
import org.slf4j.Logger;

import java.util.Arrays;

/**
 * @Author wenjun
 * @Date 2020/9/23
 * @Description
 */
public class JsonLogger extends LoggerDecorator{
    public JsonLogger(Logger logger) {
        super(logger);
    }

    @Override
    public void info(String s) {
        JSONObject result = newJsonObject();
        result.put("message: ",s);
        logger.info(result.toString());
    }

    @Override
    public void error(String s) {
        JSONObject result = newJsonObject();
        result.put("error: ",s);
        logger.info(result.toString());
    }
    public void error(Exception e){
        JSONObject result = newJsonObject();
        result.put("exception: ",e);
        String trace = Arrays.toString(e.getStackTrace());
        result.put("starckTrace: ",trace);
        logger.info(result.toString());
    }
    private JSONObject newJsonObject(){
        return new JSONObject();
    }
}
