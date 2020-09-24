package com.study.pattern.flyweight.general;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author wenjun
 * @Date 2020/9/24
 * @Description
 */
public class FlyweightFactory {
    private static Map<String,IFlyweight> pool = new HashMap<>();

    public static IFlyweight getFlyweight(String intrinsicState){
        if(!pool.containsKey(intrinsicState)){
            IFlyweight flyweight = new ConcreteFlyweight(intrinsicState);
            pool.put(intrinsicState,flyweight);
        }
        return pool.get(intrinsicState);
    }
}
