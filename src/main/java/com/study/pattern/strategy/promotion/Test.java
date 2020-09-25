package com.study.pattern.strategy.promotion;

/**
 * @Author wenjun
 * @Date 2020/9/25
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        PromotionStrategyFactory.getPromotionKeys();
        String promotionKey = "COUPON";
        IPromotionStrategy promotionStrategy = PromotionStrategyFactory.getPromotionStrategy(promotionKey);
        promotionStrategy.doPromotion();
    }
}
