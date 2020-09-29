package com.study.pattern.observer.myobserver;

/**
 * @Author wenjun
 * @Date 2020/9/29
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        My my = My.getInstance();
        Teacher jack = new Teacher("jack");
        Teacher jerry = new Teacher("jerry");

        my.addObserver(jack);
        my.addObserver(jerry);


        Question question = new Question();
        question.setUserName("小李");
        question.setContent("小李喜欢的芝麻酱嚯红糖是啥");
        my.publishQuestion(question);
    }
}
