package com.study.pattern.adapter.demo.classdapter;

/**
 * @Author wenjun
 * @Date 2020/9/24
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        PowerAdapter powerAdapter = new PowerAdapter();
        powerAdapter.output5V();
        powerAdapter.outputAC220V();
    }
}
