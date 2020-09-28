package com.study.pattern.mediator.general;

/**
 * @Author wenjun
 * @Date 2020/9/28
 * @Description
 */
public class ConcreteColleagueB extends Colleague{

    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
        this.mediator.setColleagueB(this);
    }


    //自有方法
    public void selfMethodB(){
        System.out.println(this.getClass().getSimpleName() + ": self-methodB");
    }
    //依赖方法　　dep Method
    public void depMethodB(){
        System.out.println(this.getClass().getSimpleName() + " depMethodB");
    }
}
