package com.study.pattern.strategy.promotion;

/**
 * @Author wenjun
 * @Date 2020/9/25
 * @Description
 */
public class GroupBuyStrategy implements IPromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("3人成团,可以优惠");
    }
}
