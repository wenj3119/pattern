package com.study.pattern.chain.general;

/**
 * @Author wenjun
 * @Date 2020/9/27
 * @Description
 */
public class ConcreteHandlerA extends Handler{

    @Override
    public void handleRequest(String request) {
        if("requestA".equals(request)){
            System.out.println(this.getClass().getSimpleName() + "deal with request: " + request);
            return;
        }
        if(this.nextHandler != null){
            this.nextHandler.handleRequest(request);
        }
    }
}
