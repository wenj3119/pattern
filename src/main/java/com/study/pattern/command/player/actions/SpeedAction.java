package com.study.pattern.command.player.actions;

import com.study.pattern.command.player.IAction;
import com.study.pattern.command.player.MyPlayer;

/**
 * @Author wenjun
 * @Date 2020/9/27
 * @Description
 */
public class SpeedAction implements IAction {
    private MyPlayer player;
    public SpeedAction(MyPlayer player){
        this.player = player;
    }
    @Override
    public void execute() {
        player.speed();
    }
}
