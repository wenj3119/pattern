package com.study.pattern.bridge.message;

/**
 * @Author wenjun
 * @Date 2020/9/24
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        IMessage message = new SmsMessage();
        AbstractMessage abstractMessage = new NormalMessage(message);
        abstractMessage.sendMessage("加班申请","李总");

        message = new EmailMessage();
        abstractMessage = new UrgencyMessage(message);
        abstractMessage.sendMessage("加班申请","大总");
    }
}
