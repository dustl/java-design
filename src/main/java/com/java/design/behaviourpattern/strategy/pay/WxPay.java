package com.java.design.behaviourpattern.strategy.pay;

/**
 * @author liwy
 * @date 2022/7/15
 */
public class WxPay implements Payment{
    @Override
    public PayResult pay(String uid, double amount) {
        System.out.println("微信支付...");
        return PayResult.builder().msg("微信支付成功..").code(200).build();
    }
}
