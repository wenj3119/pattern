package com.study.pattern.state.general.simple;

/**
 * @Author wenjun
 * @Date 2020/9/28
 * @Description
 */
public class Context {
    public static final IState STATE_A = new ConcreteStateA();
    public static final IState STATE_B = new ConcreteStateB();

    private IState currentState = STATE_A;

    public void setState(IState state){
        this.currentState = state;
    }

    public void handler(){
        this.currentState.handler();
    }
    public IState getState(){
        return this.currentState;
    }
}
