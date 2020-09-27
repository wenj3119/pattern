package com.study.pattern.command.general;

/**
 * @Author wenjun
 * @Date 2020/9/27
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        ICommand cmd = new ConcreteCommand();
        Invoker invoker = new Invoker(cmd);
        invoker.action();
    }
}
