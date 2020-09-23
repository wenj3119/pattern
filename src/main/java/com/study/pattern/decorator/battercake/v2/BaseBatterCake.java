package com.study.pattern.decorator.battercake.v2;

/**
 * @Author wenjun
 * @Date 2020/9/23
 * @Description
 */
public class BaseBatterCake extends BatterCake{
    @Override
    protected String getMsg() {
        return "煎饼";
    }

    @Override
    protected int getPrice() {
        return 5;
    }
}
