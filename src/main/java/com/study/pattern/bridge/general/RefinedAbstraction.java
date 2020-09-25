package com.study.pattern.bridge.general;

/**
 * @Author wenjun
 * @Date 2020/9/24
 * @Description
 */
public class RefinedAbstraction extends Abstraction{

    public RefinedAbstraction(IImplementor iImplementor) {
        super(iImplementor);
    }

    @Override
    public void operation() {
        super.operation();
    }
}
