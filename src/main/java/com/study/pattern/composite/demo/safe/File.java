package com.study.pattern.composite.demo.safe;

/**
 * @Author wenjun
 * @Date 2020/9/24
 * @Description
 */
public class File extends Directory{

    public File(String name) {
        super(name);
    }

    @Override
    public void show() {
        System.out.println(this.name);
    }
}
