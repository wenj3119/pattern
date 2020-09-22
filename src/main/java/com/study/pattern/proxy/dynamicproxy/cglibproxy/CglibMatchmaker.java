package com.study.pattern.proxy.dynamicproxy.cglibproxy;

import com.study.pattern.proxy.dynamicproxy.jdkproxy.IPerson;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author wenjun
 * @Date 2020/9/21
 * @Description
 */
public class CglibMatchmaker implements InvocationHandler {
    private IPerson target;

    public IPerson getInstance(IPerson target){
        this.target = target;
        Class<?> clazz = target.getClass();
        return (IPerson) Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
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
