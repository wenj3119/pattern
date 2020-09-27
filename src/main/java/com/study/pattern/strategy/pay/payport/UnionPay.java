package com.study.pattern.strategy.pay.payport;

/**
 * @Author wenjun
 * @Date 2020/9/27
 * @Description
 */
public class UnionPay extends Payment{
    public String getName(){
        return "银联支付";
    }
    @Override
    protected double queryBalance(String uid) {
        return 1000;
    }
}
