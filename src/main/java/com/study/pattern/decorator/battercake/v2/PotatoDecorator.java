package com.study.pattern.decorator.battercake.v2;

/**
 * @Author wenjun
 * @Date 2020/9/23
 * @Description
 */
public class PotatoDecorator extends BatterCakeDecorator{

    public PotatoDecorator(BatterCake batterCake) {
        super(batterCake);
    }
    protected String getMsg(){return super.getMsg() + " + 土豆丝";}
    protected int getPrice(){return super.getPrice() + 1;};
}
