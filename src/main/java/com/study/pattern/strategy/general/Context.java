package com.study.pattern.strategy.general;

/**
 * @Author wenjun
 * @Date 2020/9/25
 * @Description
 */
public class Context {
    private IStrategy mStrategy;

    public Context(IStrategy mStrategy){
        this.mStrategy = mStrategy;
    }
    public void algorithm(){
        this.mStrategy.algorithm();
    }
}
