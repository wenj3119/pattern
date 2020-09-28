package com.study.pattern.mediator.chatroom;

/**
 * @Author wenjun
 * @Date 2020/9/28
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();
        User user = new User("haha",chatRoom);
        User user2 = new User("user2",chatRoom);
        user.sendMessage("hello");
        user2.sendMessage("你好");
    }
}
