package com.study.pattern.strategy.promotion;

/**
 * @Author wenjun
 * @Date 2020/9/25
 * @Description
 */
public class EmptyStrategy implements IPromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("无优惠");
    }
}
