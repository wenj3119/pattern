package com.study.pattern.singleton.lazy;

/**
 * @Author wenjun
 * @Date 2020/9/18
 * @Description
 */
/*
  优点：写法优雅，利用了java本身特点，性能高，避免了内存浪费
  缺点：能够被反射破坏
 */
public class LazyStaticInnerClassSingleton {
    private LazyStaticInnerClassSingleton(){};
    private static LazyStaticInnerClassSingleton getInstance(){
        return LazyHolder.INSTANCE;
    }
    private static class LazyHolder{
        private static final LazyStaticInnerClassSingleton INSTANCE = new LazyStaticInnerClassSingleton();
    }
}
