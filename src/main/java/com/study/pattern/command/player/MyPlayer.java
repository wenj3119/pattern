package com.study.pattern.command.player;

/**
 * @Author wenjun
 * @Date 2020/9/27
 * @Description
 */
public class MyPlayer {
    public void play(){
        System.out.println("正常播放");
    }

    public void speed(){
        System.out.println("拖动进度条");
    }

    public void stop(){
        System.out.println("停止播放");
    }

    public void pause(){
        System.out.println("暂停播放");
    }
}
