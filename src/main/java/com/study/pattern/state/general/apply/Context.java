package com.study.pattern.state.general.apply;

/**
 * @Author wenjun
 * @Date 2020/9/28
 * @Description
 */
public class Context {
    public static final State STATE_A = new ConcreteStateA();
    public static final State STATE_B = new ConcreteStateB();

    private State currentState = STATE_A;

    public void setState(State state){
        this.currentState = state;
        this.currentState.setContext(this);
    }

    public void handler(){
        this.currentState.handler();
    }

    public State getState(){
        return this.currentState;
    }
}
