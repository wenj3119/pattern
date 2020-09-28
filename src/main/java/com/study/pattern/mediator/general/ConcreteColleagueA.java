package com.study.pattern.mediator.general;

/**
 * @Author wenjun
 * @Date 2020/9/28
 * @Description
 */
public class ConcreteColleagueA extends Colleague{
    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
        this.mediator.setColleagueA(this);
    }

    //自有方法
    public void selfMethodA(){
        System.out.println(this.getClass().getSimpleName() + ": self-methodA");
    }
    //依赖方法　　dep Method
    public void depMethodA(){
        System.out.println(this.getClass().getSimpleName() + " depMethodA");
    }
}
