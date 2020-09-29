package com.study.pattern.observer.myobserver;

import java.util.Observable;

/**
 * @Author wenjun
 * @Date 2020/9/29
 * @Description
 */
public class My extends Observable {
    private String name = "my生态圈";
    private static final My my = new My();
    private My(){};

    public static My getInstance(){
        return my;
    }

    public void publishQuestion(Question question){
        System.out.println(question.getUserName() + "提了" + question.getContent());
        setChanged();
        notifyObservers(question);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static My getMy() {
        return my;
    }
}
