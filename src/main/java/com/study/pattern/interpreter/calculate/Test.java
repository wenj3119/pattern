package com.study.pattern.interpreter.calculate;

/**
 * @Author wenjun
 * @Date 2020/9/28
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("result: " + new MyCalculator("20 / 50").calulate());
        System.out.println("result: " + new MyCalculator("20 + 50").calulate());
        System.out.println("result: " + new MyCalculator("20 - 50").calulate());
        System.out.println("result: " + new MyCalculator("20 * 50").calulate());
        System.out.println("result: " + new MyCalculator("20 + 50 - 10 * 100").calulate());
    }
}
