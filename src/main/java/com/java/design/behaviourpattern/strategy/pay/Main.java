package com.java.design.behaviourpattern.strategy.pay;

/**
 * @author liwy
 * @date 2022/7/15
 */
public class Main {

    public static void main(String[] args) {
        Order order = new Order("1", 23.3);
        // 支付的时候决定用哪个支付,先固定好算法，使用时动态决定
        PayResult payResult = order.pay(PayEnum.WX_PAY);
        System.out.println(payResult);
    }
}
