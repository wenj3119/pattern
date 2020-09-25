package com.study.pattern.bridge.message;

/**
 * @Author wenjun
 * @Date 2020/9/24
 * @Description
 */
public class SmsMessage implements IMessage{
    @Override
    public void send(String message, String toUser) {
        System.out.println("使用短信发送消息:" + message + "给: " + toUser);
    }
}
