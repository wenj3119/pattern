package com.study.pattern.singleton.lazy;

/**
 * @Author wenjun
 * @Date 2020/9/18
 * @Description
 */

/**
 * 优点：性能高了，线程安全了
 * 缺点：可读性难度加大，不够优雅
 */
public class LazyDoubleCheckSingletion {
    private volatile static LazyDoubleCheckSingletion lazyDoubleCheckSingletion;
    private LazyDoubleCheckSingletion(){
    };
    public static LazyDoubleCheckSingletion getInstance(){
        //检查是否要阻塞
        if(lazyDoubleCheckSingletion == null){
            synchronized (LazyDoubleCheckSingletion.class){
                //检查是否要重新创建实例
                if(lazyDoubleCheckSingletion == null){
                    lazyDoubleCheckSingletion = new LazyDoubleCheckSingletion();
                    //指令重排序的问题
                }
            }
        }
        return lazyDoubleCheckSingletion;
    }
}
