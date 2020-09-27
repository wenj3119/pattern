package com.study.pattern.command.player;

import com.study.pattern.command.general.ConcreteCommand;
import com.study.pattern.command.player.actions.PauseAction;
import com.study.pattern.command.player.actions.PlayAction;
import com.study.pattern.command.player.actions.SpeedAction;
import com.study.pattern.command.player.actions.StopAction;

/**
 * @Author wenjun
 * @Date 2020/9/27
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        MyPlayer player = new MyPlayer();
        Controller controller = new Controller();
        controller.execute(new PlayAction(player));

        IAction pause = new PauseAction(player);
        IAction play = new PlayAction(player);
        IAction speed = new SpeedAction(player);
        IAction stop = new StopAction(player);
        controller.addAction(pause);
        controller.addAction(play);
        controller.addAction(speed);
        controller.addAction(stop);
        controller.executes();

    }
}
