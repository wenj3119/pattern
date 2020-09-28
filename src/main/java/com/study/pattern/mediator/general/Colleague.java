package com.study.pattern.mediator.general;

/**
 * @Author wenjun
 * @Date 2020/9/28
 * @Description
 */
public abstract class Colleague {
    protected Mediator mediator;
    public Colleague(Mediator mediator){
        this.mediator = mediator;
    }
}
