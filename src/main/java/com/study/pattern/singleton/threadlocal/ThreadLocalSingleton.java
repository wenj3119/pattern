package com.study.pattern.singleton.threadlocal;

/**
 * @Author wenjun
 * @Date 2020/9/18
 * @Description
 */
public class ThreadLocalSingleton {
    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance = new ThreadLocal<ThreadLocalSingleton>(){
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        };
    };
    private ThreadLocalSingleton(){};
    public static ThreadLocalSingleton getInstance(){
        return  threadLocalInstance.get();
    }
}
