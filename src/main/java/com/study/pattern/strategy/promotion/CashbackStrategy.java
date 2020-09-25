package com.study.pattern.strategy.promotion;

/**
 * @Author wenjun
 * @Date 2020/9/25
 * @Description
 */
public class CashbackStrategy implements IPromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("使用返现策略");
    }
}
