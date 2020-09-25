package com.study.pattern.delegate.simple;

/**
 * @Author wenjun
 * @Date 2020/9/25
 * @Description
 */
public class Boss {
    public void command(String task,Leader leader){
        leader.doing(task);
    };
}
