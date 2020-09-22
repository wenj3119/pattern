package com.study.pattern.proxy.staticproxy;

/**
 * @Author wenjun
 * @Date 2020/9/21
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        Lisi lisi = new Lisi(new LisiSon());
        //Lisi lisi1 = new Lisi(new Wangwu());
        lisi.findLove();
    }
}
