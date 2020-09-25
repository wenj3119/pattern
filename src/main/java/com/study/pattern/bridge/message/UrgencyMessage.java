package com.study.pattern.bridge.message;

/**
 * @Author wenjun
 * @Date 2020/9/24
 * @Description
 */
public class UrgencyMessage extends AbstractMessage{
    public UrgencyMessage(IMessage message) {
        super(message);
    }

    void sendMessage(String message, String toUser){
        message = "[加急]" + message;
        super.sendMessage(message,toUser);
    };
    public Object watch(String messageId){
        return messageId;
    }
}
