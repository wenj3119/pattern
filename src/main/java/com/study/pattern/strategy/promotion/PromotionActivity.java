package com.study.pattern.strategy.promotion;

/**
 * @Author wenjun
 * @Date 2020/9/25
 * @Description
 */
public class PromotionActivity {
    private IPromotionStrategy strategy;

    public PromotionActivity(IPromotionStrategy strategy) {
        this.strategy = strategy;
    }
    public void execute(){
        this.strategy.doPromotion();
    }
}
