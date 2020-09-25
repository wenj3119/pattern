package com.study.pattern.delegate.simple;

/**
 * @Author wenjun
 * @Date 2020/9/25
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        new Boss().command("爬虫",new Leader());
        new Boss().command("海报图",new Leader());
        new Boss().command("卖书",new Leader());
    }
}
