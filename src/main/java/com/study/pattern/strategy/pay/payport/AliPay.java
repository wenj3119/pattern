package com.study.pattern.strategy.pay.payport;

/**
 * @Author wenjun
 * @Date 2020/9/27
 * @Description
 */
public class AliPay extends Payment{
    public String getName(){
        return "支付宝";
    }
    @Override
    protected double queryBalance(String uid) {
        return 999;
    }
}
