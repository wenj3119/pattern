package com.study.pattern.singleton.hungry;

/**
 * @Author wenjun
 * @Date 2020/9/18
 * @Description
 */

/**
 * 优点：执行效率高，没有任何锁
 * 缺点：浪费内存，肯能会造成内存浪费
 */
public class HungrySingleton {
    private static final HungrySingleton hungrySingleton = new HungrySingleton();
    private HungrySingleton(){

    }
    public static HungrySingleton getHungrySingleton(){
        return hungrySingleton;
    }
}
