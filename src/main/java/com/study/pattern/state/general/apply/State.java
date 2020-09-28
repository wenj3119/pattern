package com.study.pattern.state.general.apply;

/**
 * @Author wenjun
 * @Date 2020/9/28
 * @Description
 */
public abstract class State {
    protected Context context;

    public void setContext(Context context){
        this.context = context;
    }
    public abstract void handler();
}
