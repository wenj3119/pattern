package com.study.pattern.command.general;

/**
 * @Author wenjun
 * @Date 2020/9/27
 * @Description
 */
public class Invoker {
    private ICommand mCmd;

    public Invoker(ICommand cmd){
        this.mCmd = cmd;
    }
    public void action(){
        this.mCmd.execute();
    }
}
