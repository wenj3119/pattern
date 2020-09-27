package com.study.pattern.command.general;

/**
 * @Author wenjun
 * @Date 2020/9/27
 * @Description
 */
public class ConcreteCommand implements ICommand {
    private static Receiver receiver = new Receiver();
    @Override
    public void execute() {
        receiver.action();
    }
}
