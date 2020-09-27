package com.study.pattern.strategy.pay.payport;

/**
 * @Author wenjun
 * @Date 2020/9/27
 * @Description
 */
public class JDPay extends Payment{
    public String getName(){
        return "京东支付";
    }
    @Override
    protected double queryBalance(String uid) {
        return 988;
    }
}
