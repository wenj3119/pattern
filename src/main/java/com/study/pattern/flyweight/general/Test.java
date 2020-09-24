package com.study.pattern.flyweight.general;


/**
 * @Author wenjun
 * @Date 2020/9/24
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        String[] str = {"student","teacher","police"};
        for(int i = 0; i < 100;i ++) {
            IFlyweight iFlyweight = FlyweightFactory.getFlyweight(str[i%3]);
            iFlyweight.operation("你在干啥");
        }
    }
}
