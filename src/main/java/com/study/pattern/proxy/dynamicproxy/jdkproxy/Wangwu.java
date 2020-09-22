package com.study.pattern.proxy.dynamicproxy.jdkproxy;

/**
 * @Author wenjun
 * @Date 2020/9/21
 * @Description
 */
public class Wangwu implements IPerson {
    @Override
    public void findLove() {
        System.out.println("要求：　有车有房学历高");
    }

    @Override
    public void buySafe() {
        System.out.println("购买100万保险");
    }
}
