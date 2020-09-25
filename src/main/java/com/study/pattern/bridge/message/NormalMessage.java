package com.study.pattern.bridge.message;


/**
 * @Author wenjun
 * @Date 2020/9/24
 * @Description
 */
public class NormalMessage extends AbstractMessage{

    public NormalMessage(IMessage message) {
        super(message);
    }
    void sendMessage(String message,String toUser){
        super.sendMessage(message,toUser);
    }
}
