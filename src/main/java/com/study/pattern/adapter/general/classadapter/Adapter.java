package com.study.pattern.adapter.general.classadapter;

/**
 * @Author wenjun
 * @Date 2020/9/24
 * @Description
 */
public class Adapter extends Adaptee implements Target{
    @Override
    public int request() {
        specificRequest();
        return 0;
    }

    @Override
    public int specificRequest() {
        return super.specificRequest();
    }
}
