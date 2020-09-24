package com.study.pattern.composite.demo.safe;


/**
 * @Author wenjun
 * @Date 2020/9/24
 * @Description
 */
public abstract class Directory {
    protected String name;

    public Directory(String name){
        this.name = name;
    }
    public abstract void show();
}
