package com.study.pattern.decorator.battercake.v2;

/**
 * @Author wenjun
 * @Date 2020/9/23
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        BatterCake batterCake;
        batterCake = new BaseBatterCake();

        batterCake = new EggDecorator(batterCake);
        batterCake = new EggDecorator(batterCake);

        batterCake = new SauageDecorator(batterCake);
        batterCake = new SauageDecorator(batterCake);

        batterCake = new PotatoDecorator(batterCake);
        batterCake = new PotatoDecorator(batterCake);
        batterCake = new PotatoDecorator(batterCake);

        System.out.println(batterCake.getMsg() + ",总价：　" + batterCake.getPrice());
    }
}
