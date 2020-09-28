package com.study.pattern.mediator.chatroom;

/**
 * @Author wenjun
 * @Date 2020/9/28
 * @Description
 */
public class ChatRoom {
    public void showMsg(User user,String msg){
        System.out.println("[" + user.getName() + "]:" + msg);
    };
}
