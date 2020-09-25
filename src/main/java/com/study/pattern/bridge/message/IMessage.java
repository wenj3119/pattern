package com.study.pattern.bridge.message;

/**
 * @Author wenjun
 * @Date 2020/9/24
 * @Description
 */
public interface IMessage {
    void send(String message,String toUser);
}
