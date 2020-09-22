package com.study.pattern.proxy.dynamicproxy.myproxy.client;


import com.study.pattern.proxy.dynamicproxy.myproxy.proxy.MyClassLoader;
import com.study.pattern.proxy.dynamicproxy.myproxy.proxy.MyInvocationHandler;
import com.study.pattern.proxy.dynamicproxy.myproxy.proxy.MyProxy;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author wenjun
 * @Date 2020/9/22
 * @Description
 */
public class MyMatchmaker implements MyInvocationHandler {
    private IPerson target;

    public IPerson getInstance(IPerson target) throws NoSuchMethodException, IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException {
        this.target = target;
        Class<?> clazz = target.getClass();
        return (IPerson) MyProxy.newProxyInstance(new MyClassLoader(),clazz.getInterfaces(),this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object invoke = method.invoke(this.target, args);
        after();
        return invoke;
    }

    private void after() {
        System.out.println("开始物色");
    }

    private void before() {
        System.out.println("开始交往");
    }
}
