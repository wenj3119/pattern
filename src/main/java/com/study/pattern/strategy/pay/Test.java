package com.study.pattern.strategy.pay;

import com.study.pattern.strategy.pay.payport.PayStrategy;

/**
 * @Author wenjun
 * @Date 2020/9/27
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order("1","2020092709341212",521);
        System.out.println(order.pay(PayStrategy.JD_PAY));
    }
}
