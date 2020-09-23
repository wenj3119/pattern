package com.study.pattern.decorator.battercake.v1;

/**
 * @Author wenjun
 * @Date 2020/9/23
 * @Description
 */
public class BatterCakeWithEgg extends BatterCake{
    protected String getMsg(){return super.getMsg() + " + 1 个鸡蛋";};
    public int getPrice(){return super.getPrice() + 2;}
}
