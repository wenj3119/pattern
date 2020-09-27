package com.study.pattern.chain.general;

/**
 * @Author wenjun
 * @Date 2020/9/27
 * @Description
 */
public abstract class Handler {
    protected Handler nextHandler;

    public void setNextHandler(Handler handler){
        this.nextHandler = handler;
    }
    public abstract void handleRequest(String request);
}
