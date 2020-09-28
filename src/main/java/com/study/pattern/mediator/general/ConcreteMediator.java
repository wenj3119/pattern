package com.study.pattern.mediator.general;

/**
 * @Author wenjun
 * @Date 2020/9/28
 * @Description
 */
public class ConcreteMediator extends Mediator{
    @Override
    public void transferA() {
        this.colleagueB.selfMethodB();
    }

    @Override
    public void transferB() {
        this.colleagueA.selfMethodA();
    }
}
