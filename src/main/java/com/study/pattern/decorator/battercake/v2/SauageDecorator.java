package com.study.pattern.decorator.battercake.v2;

/**
 * @Author wenjun
 * @Date 2020/9/23
 * @Description
 */
public class SauageDecorator extends BatterCakeDecorator{


    public SauageDecorator(BatterCake batterCake){
        super(batterCake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg() + " + 1 个香肠";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 2;
    }
}
