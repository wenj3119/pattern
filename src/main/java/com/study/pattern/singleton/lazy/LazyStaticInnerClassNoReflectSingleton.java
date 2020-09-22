package com.study.pattern.singleton.lazy;

import com.sun.org.apache.bcel.internal.generic.ATHROW;

/**
 * @Author wenjun
 * @Date 2020/9/18
 * @Description
 */
/*
  优点：利用了java本身特点，性能高，避免了内存浪费,不能反射破坏
  缺点：不优雅
 */
public class LazyStaticInnerClassNoReflectSingleton {
    private LazyStaticInnerClassNoReflectSingleton(){
        if(LazyHolder.INSTANCE != null){
            throw new RuntimeException("不允许非法访问！");
        }
    };
    private static LazyStaticInnerClassNoReflectSingleton getInstance(){
        return LazyHolder.INSTANCE;
    }
    private static class LazyHolder{
        private static final LazyStaticInnerClassNoReflectSingleton INSTANCE = new LazyStaticInnerClassNoReflectSingleton();
    }
}
