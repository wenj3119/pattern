package com.study.pattern.bridge.message;

/**
 * @Author wenjun
 * @Date 2020/9/24
 * @Description
 */
public class EmailMessage implements IMessage{
    @Override
    public void send(String message, String toUser) {
        System.out.println("使用邮件发送消息" + message + " 给 " + toUser);
    }
}
