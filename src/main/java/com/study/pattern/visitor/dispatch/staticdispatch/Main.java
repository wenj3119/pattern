package com.study.pattern.visitor.dispatch.staticdispatch;

/**
 * @Author wenjun
 * @Date 2020/9/29
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        String string = "1";
        Integer integer = 1;
        Main main = new Main();
        main.test(string);
        main.test(integer);
    }
    public void test(String string){
        System.out.println("String: " + string);
    }
    public void test(Integer integer){
        System.out.println("integer: " + integer);
    }


}
