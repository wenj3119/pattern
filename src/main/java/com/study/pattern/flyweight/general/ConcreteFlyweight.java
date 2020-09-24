package com.study.pattern.flyweight.general;

/**
 * @Author wenjun
 * @Date 2020/9/24
 * @Description
 */
public class ConcreteFlyweight implements IFlyweight{
    private String intrinsicState;
    public ConcreteFlyweight(String intrinsicState){
        this.intrinsicState = intrinsicState;
    }
    @Override
    public void operation(String extrinsicState) {
        System.out.println("Object address: " + System.identityHashCode(this));
        System.out.println("IntrinsicState: " + this.intrinsicState);
        System.out.println("ExtrinsicState: " + extrinsicState);
    }
}
