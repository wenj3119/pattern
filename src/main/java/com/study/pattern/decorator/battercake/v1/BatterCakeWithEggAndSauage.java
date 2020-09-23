package com.study.pattern.decorator.battercake.v1;

/**
 * @Author wenjun
 * @Date 2020/9/23
 * @Description
 */
public class BatterCakeWithEggAndSauage extends BatterCakeWithEgg {
    protected String getMsg(){return super.getMsg() + " + 1 个香肠";};
    public int getPrice(){return super.getPrice() + 2;}
}
