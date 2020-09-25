package com.study.pattern.template.general;

/**
 * @Author wenjun
 * @Date 2020/9/25
 * @Description
 */
public abstract class AbstractClass {
    protected void step1(){
        System.out.println("AbstractClass:step1");
    }

    protected void step2(){
        System.out.println("AbstractClass:step2");
    }
    protected void step3(){
        System.out.println("AbstractClass:step3");
    }
    public final void templateMethod(){
        this.step1();
        this.step2();
        this.step3();
    }
}
