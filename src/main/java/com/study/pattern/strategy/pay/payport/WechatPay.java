package com.study.pattern.strategy.pay.payport;

import com.study.pattern.strategy.pay.payport.Payment;

/**
 * @Author wenjun
 * @Date 2020/9/27
 * @Description
 */
public class WechatPay extends Payment {
    @Override
    public String getName() {
        return "微信支付";
    }

    @Override
    protected double queryBalance(String uid) {
        return 0;
    }
}
