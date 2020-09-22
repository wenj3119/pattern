package com.study.pattern.proxy.dynamicproxy.myproxy.client;


/**
 * @Author wenjun
 * @Date 2020/9/21
 * @Description
 */
public class LisiSon implements IPerson {
    @Override
    public void findLove() {
        System.out.println("要求：　肤白貌美大长腿");
    }

    @Override
    public void buySafe() {
        System.out.println("购买30万保险");
    }
}
