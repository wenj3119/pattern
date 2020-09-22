package com.study.pattern.proxy.dynamicproxy.jdkproxy;

/**
 * @Author wenjun
 * @Date 2020/9/21
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        JdkMatchmaker jdkMatchmaker = new JdkMatchmaker();
        IPerson instance = jdkMatchmaker.getInstance(new LisiSon());
        instance.findLove();
        instance.buySafe();

        IPerson instance1 = jdkMatchmaker.getInstance(new Wangwu());
        instance1.findLove();
        instance1.buySafe();
    }
}
