package com.study.pattern.singleton.seriable;

import java.io.Serializable;

/**
 * @Author wenjun
 * @Date 2020/9/18
 * @Description
 */
public class SeriableSingleton implements Serializable {
    //序列化
    //把内存中对象的状态转换为字节码的形式
    //把字节码通过IO输出流，写到磁盘上
    //永久保存下来，持久化

    //反序列化
    //将持久化的字节码内容，通过IO输入流读取内存中
    //转换成java对象
    private static final SeriableSingleton INSTANCE = new SeriableSingleton();
    private SeriableSingleton(){

    }
    public static SeriableSingleton getInstance(){
        return INSTANCE;
    }
    private Object readResolve(){
        return INSTANCE;
    }
}
