package com.study.pattern.mediator.chatroom;

/**
 * @Author wenjun
 * @Date 2020/9/28
 * @Description
 */
public class User {
    private String name;
    private ChatRoom chatRoom;

    public User(String name,ChatRoom chatRoom){
        this.name = name;
        this.chatRoom = chatRoom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String msg){
        this.chatRoom.showMsg(this,msg);
    }
}
