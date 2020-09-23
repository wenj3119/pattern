package com.study.pattern.decorator.battercake.v1;

/**
 * @Author wenjun
 * @Date 2020/9/23
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        BatterCake batterCake = new BatterCake();
        System.out.println(batterCake.getMsg()+ ",总价：　" + batterCake.getPrice());

        BatterCakeWithEgg battercakeWithEgg = new BatterCakeWithEgg();
        System.out.println(battercakeWithEgg.getMsg() + ",总价：　" + battercakeWithEgg.getPrice());

        BatterCakeWithEggAndSauage battercakeWithEggAndSauage = new BatterCakeWithEggAndSauage();
        System.out.println(battercakeWithEggAndSauage.getMsg() + ",总价：　" + battercakeWithEggAndSauage.getPrice());
    }
}
