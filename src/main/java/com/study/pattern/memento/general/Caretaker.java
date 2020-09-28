package com.study.pattern.memento.general;

import java.util.Stack;

/**
 * @Author wenjun
 * @Date 2020/9/28
 * @Description
 */
public class Caretaker {
    private final Stack<Memento> STACK = new Stack<>();


    public Memento getMemento(){
        return STACK.pop();
    }
    public void storeMemento(Memento memento){
        STACK.push(memento);
    }
}
