package com.study.pattern.composite.general.safe;

/**
 * @Author wenjun
 * @Date 2020/9/24
 * @Description
 */
public abstract class Component {
    protected String name;

    public Component(String name){
        this.name = name;
    }
    public abstract String operation();
}
