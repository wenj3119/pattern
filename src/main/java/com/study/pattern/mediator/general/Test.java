package com.study.pattern.mediator.general;

/**
 * @Author wenjun
 * @Date 2020/9/28
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        ConcreteMediator concreteMediator = new ConcreteMediator();
        concreteMediator.setColleagueA(new ConcreteColleagueA(concreteMediator));
        concreteMediator.setColleagueB(new ConcreteColleagueB(concreteMediator));
        concreteMediator.transferA();
        concreteMediator.transferB();

    }
}
