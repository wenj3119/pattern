package com.study.pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author wenjun
 * @Date 2020/9/18
 * @Description
 */
public class ContainerSingleton {
    private ContainerSingleton(){};
    private static Map<String,Object> ioc = new ConcurrentHashMap<>();
    public static Object getInstance(String className){
        Object instance = null;
        if(!ioc.containsKey(className)){
            try {
                instance = Class.forName(className).newInstance();
                ioc.put(className,instance);
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            return instance;
        }else{
            return ioc.get(className);
        }
    }
}
