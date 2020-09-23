package com.study.pattern.decorator.battercake.v2;

/**
 * @Author wenjun
 * @Date 2020/9/23
 * @Description
 */
public class BatterCakeDecorator extends BatterCake{
    private BatterCake batterCake;

    public BatterCakeDecorator(BatterCake batterCake){
        this.batterCake = batterCake;
    }

    @Override
    protected String getMsg() {
        return this.batterCake.getMsg();
    }

    @Override
    protected int getPrice() {
        return this.batterCake.getPrice();
    }
}
