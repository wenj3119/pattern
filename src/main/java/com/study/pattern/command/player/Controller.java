package com.study.pattern.command.player;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author wenjun
 * @Date 2020/9/27
 * @Description
 */
public class Controller {
    private List<IAction> actions = new ArrayList<>();
    public void addAction(IAction action){
        actions.add(action);
    }
    public void execute(IAction action){
        action.execute();
    }

    public void executes(){
        for(IAction a : actions){
            a.execute();
        }
        actions.clear();
    }
}
