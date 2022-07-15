package com.java.design.strategy.pay;

/**
 * @author liwy
 * @date 2022/7/15
 */
public class AliPay implements Payment{
    @Override
    public PayResult pay(String uid, double amount) {
        System.out.println("支付宝支付...");
        return PayResult.builder().code(200).msg("支付成功").build();
    }
}
