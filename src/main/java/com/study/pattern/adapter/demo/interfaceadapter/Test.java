package com.study.pattern.adapter.demo.interfaceadapter;

/**
 * @Author wenjun
 * @Date 2020/9/24
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        DC dc = new PowerAdapter(new AC220());
        dc.output12V();
    }
}
