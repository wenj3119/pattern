package com.study.pattern.bridge.message;

/**
 * @Author wenjun
 * @Date 2020/9/24
 * @Description
 */
public abstract class AbstractMessage {
    private IMessage message;
    public AbstractMessage(IMessage message){
        this.message = message;
    }
    void sendMessage(String message,String toUser){
        this.message.send(message,toUser);
    }
}
