package com.study.pattern.singleton.lazy;

/**
 * @Author wenjun
 * @Date 2020/9/18
 * @Description
 */

/**
 * 优点：节省了内存
 * 缺点：线程不安全,使用synchronized解决，缺点，性能下降
 */
public class LazySimpleSingleton {
    private static LazySimpleSingleton lazySimpleSingleton;
    private LazySimpleSingleton(){};
    public synchronized static LazySimpleSingleton getInstance(){
        if(lazySimpleSingleton == null){
            lazySimpleSingleton = new LazySimpleSingleton();
        }
        return lazySimpleSingleton;
    }
}
