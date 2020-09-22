package com.study.pattern.singleton.hungry;

/**
 * @Author wenjun
 * @Date 2020/9/18
 * @Description
 */
public class HungryStaticSingleton {
    private static final HungryStaticSingleton hungryStaticSingleton;
    static {
        hungryStaticSingleton = new HungryStaticSingleton();
    }
    private HungryStaticSingleton(){};
    private static HungryStaticSingleton getInstance(){
        return hungryStaticSingleton;
    }
}
