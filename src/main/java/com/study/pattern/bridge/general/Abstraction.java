package com.study.pattern.bridge.general;

/**
 * @Author wenjun
 * @Date 2020/9/24
 * @Description
 */
public abstract class Abstraction {
    protected IImplementor iImplementor;

    public Abstraction(IImplementor iImplementor){
        this.iImplementor = iImplementor;
    }

    public void operation(){this.iImplementor.operationImpl();}

}
