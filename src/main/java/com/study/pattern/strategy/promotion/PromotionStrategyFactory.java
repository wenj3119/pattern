package com.study.pattern.strategy.promotion;

import com.study.pattern.delegate.simple.EmployeeA;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author wenjun
 * @Date 2020/9/25
 * @Description
 */
public class PromotionStrategyFactory {
    private static Map<String,IPromotionStrategy> PROMOTIONS = new HashMap<>();
    private PromotionStrategyFactory(){
    }
    static {
        PROMOTIONS.put(PromotionKey.COUPON,new CouponStrategy());
        PROMOTIONS.put(PromotionKey.CASHBACK,new CashbackStrategy());
        PROMOTIONS.put(PromotionKey.GROUPBUY,new GroupBuyStrategy());
    }
    private static final IPromotionStrategy EMPTY = new EmptyStrategy();
    public static IPromotionStrategy getPromotionStrategy(String promotionKey){
        IPromotionStrategy strategy = PROMOTIONS.get(promotionKey);
        return strategy == null ? EMPTY : strategy;
    }

    private interface PromotionKey{
        String COUPON = "COUPON";
        String CASHBACK = "CASHBACK";
        String GROUPBUY = "GROUPBUY";
    }

    public static Set<String> getPromotionKeys(){
        return PROMOTIONS.keySet();
    }

}
